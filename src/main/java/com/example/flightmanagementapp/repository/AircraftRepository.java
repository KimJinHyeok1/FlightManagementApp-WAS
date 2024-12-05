package com.example.flightmanagementapp.repository;

import com.example.flightmanagementapp.domain.aircraft.Entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository <Aircraft, String> {
}
