package com.example.flightmanagementapp.domain.aircraft.Dto;

import com.example.flightmanagementapp.domain.aircraft.Entity.FlightDataOperator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDataDto {

    private String flightNumber;

    private AircraftDto aircraft;
    private List<BatteryDto> batteries;
    private FlightDataOperator flightDataOperator;

    private int windSpeed;
    private int windDirection;
    private int temperature;
    private ZonedDateTime flightDate;
    private int flightTime;

    private String payloadItem;
    private int payloadWeight;

    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;
}
