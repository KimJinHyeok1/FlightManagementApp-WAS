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
public class FlightDataOperator {
    @Id
    @Column(unique = true, nullable = false)
    @Comment("연결 테이블 ID")
    private int id;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "flightNumber")
    private FlightData flightData_id;
    @OneToOne
    @JoinColumn(name = "ep_id")
    private Person externalPilot;
    @OneToOne
    @JoinColumn(name = "ip_id")
    private Person internalPilot;
    @OneToOne
    @JoinColumn(name = "observer_id")
    private Person observer;

}
