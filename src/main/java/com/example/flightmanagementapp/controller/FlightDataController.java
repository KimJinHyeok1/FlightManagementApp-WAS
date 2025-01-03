package com.example.flightmanagementapp.controller;

import com.example.flightmanagementapp.domain.aircraft.Dto.FlightDataDto;
import com.example.flightmanagementapp.domain.aircraft.Dto.RequestFlightDataDto;
import com.example.flightmanagementapp.services.FlightDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class FlightDataController {

    private final FlightDataService flightDataService;

    @GetMapping("/flightData/all")
    public ResponseEntity<List<FlightDataDto>> getAllFlightData(){
        return flightDataService.getAllData();
    }

    @GetMapping("/flightData/acName")
    public ResponseEntity<List<FlightDataDto>> getFlightDataByAircraftName(@RequestParam String aircraftName){
        return flightDataService.getFlightDataByAircraftName(aircraftName);
    }

    @GetMapping("/flightData/opName")
    public ResponseEntity<List<FlightDataDto>> getFlightDataByOperatorName(@RequestParam String operatorName){
        return flightDataService.getFlightDataByOperatorName(operatorName);
    }

    @GetMapping("/flightData/date")
    public ResponseEntity<List<FlightDataDto>> getFlightDataByDate(@RequestParam String startDate, String endDate){
        LocalDate localFlightStartDate = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate localFlightEndDate = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        return flightDataService.getFlightDataByDate(localFlightStartDate, localFlightEndDate);
    }

    @PostMapping("/flightData")
    public ResponseEntity<FlightDataDto> createFlightData(@RequestBody RequestFlightDataDto flightData){
        return flightDataService.createFlightData(flightData);
    }
}
