package com.example.flightmanagementapp.domain.aircraft.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AircraftDto {

    private String aircraftName;
    private String aircraftRegisterNum;
    private String aircraftSerialNum;
    private int aircraftMTOW;
    private String aircraftType;
    private String aircraftDescription;
    private int totalFlightTime;
}
