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
@SequenceGenerator(
        name = "FO_SEQ_GENERATOR",
        sequenceName = "FO_SEQUENCE",
        initialValue = 30,
        allocationSize = 1
)
public class FlightDataOperator {
    @Id
    @Column(unique = true, nullable = false)
    @Comment("연결 테이블 ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FO_SEQ_GENERATOR")
    private int id;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "flightNumber")
    private FlightData flightData_id;
    @ManyToOne
    @JoinColumn(name = "ep_id")
    private Person externalPilot;
    @ManyToOne
    @JoinColumn(name = "ip_id")
    private Person internalPilot;
    @ManyToOne
    @JoinColumn(name = "observer_id")
    private Person observer;

}
