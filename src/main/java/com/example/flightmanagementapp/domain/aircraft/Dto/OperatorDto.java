package com.example.flightmanagementapp.domain.aircraft.Dto;

import com.example.flightmanagementapp.domain.aircraft.enums.OperatorsRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperatorDto {

    private int id;
    private String name;
    private String phoneNumber;
    private String teamName;
    private String position;
    private String certification;
    private OperatorsRole role;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;

}
