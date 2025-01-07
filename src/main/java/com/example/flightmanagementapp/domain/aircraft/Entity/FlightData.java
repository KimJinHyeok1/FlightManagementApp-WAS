package com.example.flightmanagementapp.domain.aircraft.Entity;


import jakarta.persistence.*;
import lombok.Builder;
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

    @ManyToOne
    @JoinColumn
    Aircraft aircraft;

    @OneToMany(mappedBy = "flightData")
    List<FlightBattery> batteries = new ArrayList<>();
    @OneToOne(mappedBy = "flightData_id", cascade = CascadeType.PERSIST)
    FlightDataOperator flightDataOperator;

    @Comment("풍속")
    private int windSpeed;
    @Comment("풍향")
    private int windDirection;
    @Comment("습도")
    private int humidity;
    @Comment("온도")
    private int temperature;
    @Comment("비행 장소")
    private String flightSpot;
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


    @Builder
    public FlightData(String flightNumber, Aircraft aircraft,
                      int windSpeed, int windDirection,
                      int humidity, int temperature,
                      String flightSpot,
                      LocalDate flightDate, LocalTime flightTime,
                      String payloadItem, int payloadWeight)
    {
      this.flightNumber = flightNumber;
      this.aircraft = aircraft;
      this.windSpeed = windSpeed;
      this.windDirection = windDirection;
      this.humidity = humidity;
      this.flightDate = flightDate;
      this.flightSpot = flightSpot;
      this.flightTime = flightTime;
      this.payloadItem = payloadItem;
      this.payloadWeight = payloadWeight;
      this.temperature = temperature;
    }

    @PreUpdate
    private void preUpdate(){
        this.updatedAt = ZonedDateTime.now();
    }

}
