package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.AircraftDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Aircraft;
import com.example.flightmanagementapp.domain.aircraft.mapper.AircraftMapper;
import com.example.flightmanagementapp.repository.AircraftRepository;
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

}
