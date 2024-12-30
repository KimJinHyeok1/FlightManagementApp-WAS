package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.FlightDataDto;
import com.example.flightmanagementapp.domain.aircraft.Dto.RequestFlightDataDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.*;
import com.example.flightmanagementapp.domain.aircraft.mapper.FlightDataMapper;
import com.example.flightmanagementapp.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FlightDataService {

    private final FlightDataRepository flightDataRepository;
    private final AircraftRepository aircraftRepository;
    private final BatteryRepository batteryRepository;
    private final OperatorRepository operatorRepository;

    private final FlightBatteryRepository flightBatteryRepository;
    private final FlightDataOperatorRepository flightDataOperatorRepository;

    public ResponseEntity<List<FlightDataDto>> getAllData(){
        List<FlightData> flightDataList = flightDataRepository.findAll();
        return ResponseEntity.ok(FlightDataMapper.MAPPER.toDtoList(flightDataList));
    }

    public ResponseEntity<FlightDataDto> getFlightData(String flightNumber){
        FlightData flightData = flightDataRepository.findById(flightNumber).orElseThrow(() ->
                new NullPointerException("해당 FlightNumber가 없습니다."));
        return ResponseEntity.ok(FlightDataMapper.MAPPER.toDto(flightData));
    }

    public ResponseEntity<FlightDataDto> createFlightData(RequestFlightDataDto flightDataDto){
        Aircraft aircraftData = aircraftRepository.findById(flightDataDto.getAircraftName())
                .orElseThrow(NullPointerException::new);

        FlightData flightData = FlightData.builder()
                .flightNumber(flightDataDto.getFlightNumber())
                .aircraft(aircraftData)
                .flightTime(flightDataDto.getFlightTime())
                .flightDate(flightDataDto.getFlightDate())
                .windSpeed(flightDataDto.getWindSpeed())
                .windDirection(flightDataDto.getWindDirection())
                .humidity(flightDataDto.getHumidity())
                .temperature(flightDataDto.getTemperature())
                .payloadItem(flightDataDto.getPayloadType())
                .payloadWeight(flightDataDto.getPayloadWeight()).build();

        FlightData responseData = flightDataRepository.save(flightData);

        for(int i = 0; i < flightDataDto.getFlightBatteries().size(); ++i){
            Battery battery = batteryRepository.findById(flightDataDto.getFlightBatteries()
                    .get(i)).orElseThrow(NullPointerException::new);

            int batteryUsingTime = battery.getTotalUsingTime();
            if(flightDataDto.getFlightTime().getHour() > 0){
                battery.setTotalUsingTime(batteryUsingTime + (60 * flightDataDto.getFlightTime().getHour()
                        + flightDataDto.getFlightTime().getMinute()));
            }
            else battery.setTotalUsingTime(batteryUsingTime + flightDataDto.getFlightTime().getMinute());

            FlightBattery flightBattery = new FlightBattery();
            flightBattery.setBattery(battery);
            flightBattery.setFlightData(flightData);
            flightBatteryRepository.save(flightBattery);
        }

        FlightDataOperator flightDataOperator = new FlightDataOperator();
        flightDataOperator.setFlightData_id(flightData);
        flightDataOperator.setExternalPilot(operatorRepository.findById(flightDataDto.getOperators().get(0))
                .orElseThrow(NullPointerException::new));
        flightDataOperator.setInternalPilot(operatorRepository.findById(flightDataDto.getOperators().get(1))
                .orElseThrow(NullPointerException::new));

        flightDataOperatorRepository.save(flightDataOperator);

        return ResponseEntity.ok(FlightDataMapper.MAPPER.toDto(responseData));
    }
}
