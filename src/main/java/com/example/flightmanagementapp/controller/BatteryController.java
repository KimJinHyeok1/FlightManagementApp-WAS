package com.example.flightmanagementapp.controller;

import com.example.flightmanagementapp.domain.aircraft.Dto.BatteryDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import com.example.flightmanagementapp.services.BatteryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class BatteryController {

    private final BatteryService batteryService;

    //Find - 전체 조회
    @GetMapping("/battery")
    public ResponseEntity<List<BatteryDto>> getAllAircraftData(){
        return batteryService.getAll();
    }

    //Create - 생성
    @PostMapping("/battery")
    public ResponseEntity<BatteryDto> postAircraftData(@RequestBody final BatteryDto batteryDto){
        return batteryService.createBatteryData(batteryDto);
    }

    @PatchMapping("/battery/{batterySerialNum}")
    public ResponseEntity<BatteryDto> modifyAircraftData(@PathVariable String batterySerialNum,
                                                      @RequestBody final  BatteryDto batteryDto){
        return batteryService.modifyBatteryData(batterySerialNum, batteryDto);
    }

    //delete - 삭제
    @DeleteMapping("/battery")
    public HttpStatus deleteAircraftData(@RequestParam String batterySerialNum){
        return batteryService.deleteAircraftData(batterySerialNum);
    }
}
