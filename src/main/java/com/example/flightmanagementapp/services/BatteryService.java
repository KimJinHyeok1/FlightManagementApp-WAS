package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.AircraftDto;
import com.example.flightmanagementapp.domain.aircraft.Dto.BatteryDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Aircraft;
import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import com.example.flightmanagementapp.domain.aircraft.mapper.BatteryMapper;
import com.example.flightmanagementapp.repository.BatteryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BatteryService {

    private final BatteryRepository batteryRepository;

    public ResponseEntity<List<BatteryDto>> getAll() {
        List<Battery> batteries = batteryRepository.findAll();
        return ResponseEntity.ok(BatteryMapper.MAPPER.toDtoList(batteries));
    }

    public ResponseEntity<BatteryDto> createBatteryData(BatteryDto batteryDto) {
        Battery battery = batteryRepository.save(BatteryMapper.MAPPER.toEntity(batteryDto));
        return ResponseEntity.ok(BatteryMapper.MAPPER.toDto(battery));
    }

    public HttpStatus deleteAircraftData(String batterySerialNum){
        batteryRepository.deleteById(batterySerialNum);
        return HttpStatus.OK;
    }

    @Transactional
    public ResponseEntity<BatteryDto> modifyBatteryData(String batterySerialNum, BatteryDto batteryDto){

        Battery battery = batteryRepository.findById(batterySerialNum)
                .orElseThrow(()-> new NullPointerException("해당 배터리 아이디가 존재하지 않습니다"));

        battery.setBatteryType(batteryDto.getBatteryType());
        battery.setBatteryCapacity(batteryDto.getBatteryCapacity());
        battery.setBatteryCell(batteryDto.getBatteryCell());

        return ResponseEntity.ok(BatteryMapper.MAPPER.toDto(battery));
    }
}
