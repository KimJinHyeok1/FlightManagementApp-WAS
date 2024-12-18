package com.example.flightmanagementapp.domain.aircraft.Entity;

import com.example.flightmanagementapp.domain.aircraft.enums.OperatorsRole;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    @Column(unique = true, nullable = false)
    @Comment("운용자 id")
    private int id;
    @Comment("운용자 이름")
    private String name;
    @Comment("전화번호")
    private String phoneNumber;
    @Comment("팀 이름")
    private String teamName;
    @Comment("직급")
    private String position;
    @Comment("조종 자격")
    private String certification;

    @Comment("생성 일시")
    private ZonedDateTime createdAt;
    @Comment("갱신 일시")
    private ZonedDateTime updatedAt;

    @Builder
    public Person(String name, String phoneNumber, String teamName,
                  String position, String certification) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.teamName = teamName;
        this.position = position;
        this.certification = certification;
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
