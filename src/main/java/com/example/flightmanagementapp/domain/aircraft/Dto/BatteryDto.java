package com.example.flightmanagementapp.domain.aircraft.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BatteryDto {

        private String batterySerialNum;
        private String batteryType;
        private int batteryCell;
        private int batteryCapacity;
    }
