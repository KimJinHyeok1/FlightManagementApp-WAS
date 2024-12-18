package com.example.flightmanagementapp.repository;

import com.example.flightmanagementapp.domain.aircraft.Entity.FlightData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDataRepository extends JpaRepository<FlightData, String> {
}
