package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.FlightDataDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.FlightData;
import com.example.flightmanagementapp.domain.aircraft.mapper.FlightDataMapper;
import com.example.flightmanagementapp.repository.FlightDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FlightDataService {

    private final FlightDataRepository flightDataRepository;

    public ResponseEntity<List<FlightDataDto>> getAllData(){
        List<FlightData> flightDataList = flightDataRepository.findAll();
        return ResponseEntity.ok(FlightDataMapper.MAPPER.toDtoList(flightDataList));
    }
}
