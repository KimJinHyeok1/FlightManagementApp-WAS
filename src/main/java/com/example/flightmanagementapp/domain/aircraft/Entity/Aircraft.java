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
@Table(name = "aircraft")
public class Aircraft {
    //필드
    @Id
    @Column(unique = true, nullable = false)
    @Comment("기체 신고번호 / 기체 이름")
    private String aircraftName;
    @Comment("기체 등록번호")
    private String aircraftRegisterNum;
    @Comment("기체 시리얼 넘버")
    private String aircraftSerialNum;
    @Comment("기체 MTOW")
    private int aircraftMTOW;
    @Comment("기체 종류/타입")
    private String aircraftType;
    @Comment("기체 특이사항, 설명")
    private String aircraftDescription;
    @Comment("생성 일시")
    private ZonedDateTime createdAt;
    @Comment("갱신 일시")
    private ZonedDateTime updatedAt;


    @Builder
    public Aircraft(String aircraftName, String aircraftRegisterNum, String aircraftSerialNum,
                    int aircraftMTOW, String aircraftType, String aircraftDescription){
        this.aircraftName = aircraftName;
        this.aircraftRegisterNum = aircraftRegisterNum;
        this.aircraftSerialNum = aircraftSerialNum;
        this.aircraftMTOW = aircraftMTOW;
        this.aircraftType = aircraftType;
        this.aircraftDescription = aircraftDescription;
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
