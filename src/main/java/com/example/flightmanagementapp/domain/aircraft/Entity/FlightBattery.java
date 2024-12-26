package com.example.flightmanagementapp.domain.aircraft.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class FlightBattery {
    @Id
    @Column(unique = true, nullable = false)
    @Comment("Flight Data and Battery 연결 테이블 ID")
    private int id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "flightNumber")
    private FlightData flightData;
    @ManyToOne
    @JoinColumn(name = "batterySerialNum")
    private Battery battery;
}
