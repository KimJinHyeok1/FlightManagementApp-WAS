package com.example.flightmanagementapp.domain.aircraft.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.ZonedDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "battery")
public class Battery {
    @Id
    @Column(unique = true, nullable = false)
    @Comment("배터리 시리얼 넘버")
    private String batterySerialNum;
    @Comment("배터리 타입")
    private String batteryType;
    @Comment("배터리 셀(Cell)")
    private int batteryCell;
    @Comment("배터리 용량(mAh)")
    private int batteryCapacity;
    @Comment("생성 일시")
    private ZonedDateTime createdAt;
    @Comment("갱신 일시")   
    private ZonedDateTime updatedAt;


    @Builder
    public Battery(String batterySerialNum, String batteryType, int batteryCell,
                   int batteryCapacity)
    {
      this.batterySerialNum = batterySerialNum;
      this.batteryType = batteryType;
      this.batteryCell = batteryCell;
      this.batteryCapacity = batteryCapacity;
    }

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
