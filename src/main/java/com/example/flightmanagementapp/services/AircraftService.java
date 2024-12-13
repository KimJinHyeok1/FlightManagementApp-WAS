package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.AircraftDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Aircraft;
import com.example.flightmanagementapp.domain.aircraft.mapper.AircraftMapper;
import com.example.flightmanagementapp.repository.AircraftRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class AircraftService {
    private final AircraftRepository aircraftRepository;

    public List<Aircraft> getAll() {
        return aircraftRepository.findAll();
    }

    public ResponseEntity<Aircraft> createAircraftData(AircraftDto aircraftDto) {
        return ResponseEntity.ok(aircraftRepository.save(AircraftMapper.MAPPER.toEntity(aircraftDto)));
    }

    public HttpStatus deleteAircraftData(String aircraftName){
        aircraftRepository.deleteById(aircraftName);
        return HttpStatus.OK;
    }

    @Transactional
    public ResponseEntity<Aircraft> modifyAircraftData(String aircraftName, AircraftDto aircraftDto){

        Aircraft aircraft = aircraftRepository.findById(aircraftName)
                .orElseThrow(()-> new NullPointerException("해당 기체 아이디가 존재하지 않습니다"));

        aircraft.setAircraftType(aircraftDto.getAircraftType());
        aircraft.setAircraftMTOW(aircraftDto.getAircraftMTOW());
        aircraft.setAircraftRegisterNum(aircraftDto.getAircraftRegisterNum());
        aircraft.setAircraftSerialNum(aircraftDto.getAircraftSerialNum());
        aircraft.setAircraftDescription(aircraftDto.getAircraftDescription());

        return ResponseEntity.ok(aircraft);
    }
}
