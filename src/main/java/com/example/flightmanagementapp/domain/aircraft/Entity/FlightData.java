package com.example.flightmanagementapp.domain.aircraft.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "flightData")
public class FlightData {

    @Id
    @Column(unique = true, nullable = false)
    @Comment("비행 번호")
    private String flightNumber;

    @OneToOne
    @JoinColumn
    Aircraft aircraft;

    @OneToMany(mappedBy = "flightData")
    List<FlightBattery> batteries = new ArrayList<>();
    @OneToOne(mappedBy = "flightData_id")
    FlightDataOperator flightDataOperator;

    @Comment("풍속")
    private int windSpeed;
    @Comment("풍향")
    private int windDirection;
    @Comment("습도")
    private int humidity;
    @Comment("온도")
    private int temperature;
    @Comment("비행 일시")
    private LocalDate flightDate;
    @Comment("비행 시간")
    private LocalTime flightTime;
    
    @Comment("임무장치")
    private String payloadItem;
    @Comment("임무장치 무게")
    private int payloadWeight;


    @Comment("생성 일시")
    private ZonedDateTime createdAt;
    @Comment("갱신 일시")
    private ZonedDateTime updatedAt;


    @PrePersist
    private void prePersist(){
        this.createdAt = ZonedDateTime.now();
        this.updatedAt = ZonedDateTime.now();
    }

    @PreUpdate
    private void preUpdate(){
        this.updatedAt = ZonedDateTime.now();
    }

}
