package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.BatteryDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import com.example.flightmanagementapp.domain.aircraft.mapper.BatteryMapper;
import com.example.flightmanagementapp.repository.BatteryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BatteryService {

    private final BatteryRepository batteryRepository;

    public List<Battery> getAll() {
        return batteryRepository.findAll();
    }

    public ResponseEntity<Battery> createBatteryData(BatteryDto batteryDto) {
        return ResponseEntity.ok(batteryRepository.save(BatteryMapper.MAPPER.toEntity(batteryDto)));
    }

    public HttpStatus deleteAircraftData(String batterySerialNum){
        batteryRepository.deleteById(batterySerialNum);
        return HttpStatus.OK;
    }
}
