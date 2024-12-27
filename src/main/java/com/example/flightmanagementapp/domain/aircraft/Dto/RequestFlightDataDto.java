package com.example.flightmanagementapp.domain.aircraft.Dto;

import com.example.flightmanagementapp.domain.aircraft.Entity.FlightDataOperator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestFlightDataDto {

    private String flightNumber;
    private String aircraftName;
    private List<String> flightBatteries;
    private List<Integer> operators;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private String payloadType;
    private int payloadWeight;
    private int temperature;
    private int windDirection;
    private int windSpeed;
    private int humidity;
}
