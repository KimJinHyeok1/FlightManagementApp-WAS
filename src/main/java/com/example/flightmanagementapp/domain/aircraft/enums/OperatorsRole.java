package com.example.flightmanagementapp.domain.aircraft.enums;

import lombok.Getter;

@Getter
public enum OperatorsRole {
    INTERNAL_PILOT(0),
    EXTERNAL_PILOT(1),
    OBSERVER(2);


    private final int value;

    OperatorsRole(int value){this.value = value;}
}


