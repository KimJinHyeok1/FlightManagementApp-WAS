package com.example.flightmanagementapp.controller;

import com.example.flightmanagementapp.domain.aircraft.Dto.FlightDataDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.FlightData;
import com.example.flightmanagementapp.services.FlightDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FlightDataController {

    private final FlightDataService flightDataService;

    @GetMapping("/flightData/all")
    public ResponseEntity<List<FlightDataDto>> getAllFlightData(){
        return flightDataService.getAllData();
    }

    @GetMapping("/flightData")
    public ResponseEntity<FlightDataDto> getFlightData(@RequestParam String flightNumber){
        return flightDataService.getFlightData(flightNumber);
    }
}
