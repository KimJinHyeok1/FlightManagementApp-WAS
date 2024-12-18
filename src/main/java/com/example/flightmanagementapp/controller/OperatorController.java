package com.example.flightmanagementapp.controller;

import com.example.flightmanagementapp.domain.aircraft.Dto.OperatorDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Person;
import com.example.flightmanagementapp.services.OperatorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OperatorController {

    private final OperatorService operatorService;

    @GetMapping("/operator")
    public List<Person> getAllOperators(){
        return operatorService.getAllOperators();
    }

    @PostMapping("/operator")
    public ResponseEntity<Person> createOperatorData(@RequestBody final OperatorDto operatorDto){
        return operatorService.createOperatorData(operatorDto);
    }

    @DeleteMapping("/operator")
    public HttpStatus deleteOperatorData(@RequestParam int operatorId){
        return operatorService.deleteOperatorData(operatorId);
    }

}
