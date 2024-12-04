package com.example.flightmanagementapp.domain.aircraft;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "aircraft")
public class aircraft {
    //필드
    @Id
    @Column(name = "aircraftName", unique = true, nullable = false)
    private String aircraftName;

    @Column(nullable = false)
    private String resisterId;

    @Column(nullable = false)
    private String aircraftType;

    @Column(nullable = false)
    private int aircraftMTOW;

    //빌더
    @Builder
    public Item(String aircraftName, String resisterId, int aircraftMTOW){
        this.aircraftName = aircraftName;
        this.resisterId = resisterId;
        this.aircraftMTOW = aircraftMTOW;
    }
}
