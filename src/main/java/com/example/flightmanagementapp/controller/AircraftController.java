package com.example.flightmanagementapp.controller;

import com.example.flightmanagementapp.domain.aircraft.Dto.AircraftDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Aircraft;
import com.example.flightmanagementapp.services.AircraftService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AircraftController {

    private final AircraftService aircraftService;
    
    //Find - 전체 조회
    @GetMapping("/aircraft")
    public ResponseEntity<List<AircraftDto>> getAllAircraftData(){
      return aircraftService.getAll();
    }

    //Create - 생성
    @PostMapping("/aircraft")
    public ResponseEntity<AircraftDto> createAircraftData(@RequestBody final AircraftDto aircraftDto){
      return aircraftService.createAircraftData(aircraftDto);
    }

    //delete - 삭제
    @DeleteMapping("/aircraft")
    public HttpStatus deleteAircraftData(@RequestParam String aircraftName){
        return aircraftService.deleteAircraftData(aircraftName);
    }

    @PatchMapping("/aircraft/{aircraftName}")
    public ResponseEntity<AircraftDto> patchAircraftData(@PathVariable String aircraftName,
                                                      @RequestBody final AircraftDto aircraftDto){
        return aircraftService.modifyAircraftData(aircraftName, aircraftDto);
    }
}
