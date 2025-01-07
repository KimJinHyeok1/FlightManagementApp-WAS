package com.example.flightmanagementapp.domain.aircraft.Dto;

import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import com.example.flightmanagementapp.domain.aircraft.Entity.FlightBattery;
import com.example.flightmanagementapp.domain.aircraft.Entity.FlightDataOperator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDataDto {

    private String flightNumber;

    private AircraftDto aircraft;
    private List<FlightBatteryDto> flightBatteries;
    private FlightDataOperator flightDataOperator;

    private int windSpeed;
    private int windDirection;
    private int temperature;
    private int humidity;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private String flightSpot;

    private String payloadItem;
    private int payloadWeight;

    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
