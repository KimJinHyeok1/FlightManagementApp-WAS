package com.example.flightmanagementapp.controller;

import com.example.flightmanagementapp.domain.aircraft.Dto.BatteryDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import com.example.flightmanagementapp.services.BatteryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BatteryController {
    @Autowired
    private BatteryService batteryService;

    //Find - 전체 조회
    @GetMapping("/battery")
    public List<Battery> getAllAircraftData(){
        return batteryService.getAll();
    }

    //Create - 생성
    @PostMapping("/battery")
    public ResponseEntity<Battery> postAircraftData(@RequestBody final BatteryDto batteryDto){
        return batteryService.createBatteryData(batteryDto);
    }

    @PatchMapping("/battery/{batterySerialNum}")
    public ResponseEntity<Battery> modifyAircraftData(@PathVariable String batterySerialNum,
                                                      @RequestBody final  BatteryDto batteryDto){
        return batteryService.modifyBatteryData(batterySerialNum, batteryDto);
    }

    //delete - 삭제
    @DeleteMapping("/battery")
    public HttpStatus deleteAircraftData(@RequestParam String batterySerialNum){
        return batteryService.deleteAircraftData(batterySerialNum);
    }
}
