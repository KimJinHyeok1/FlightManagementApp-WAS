package com.example.flightmanagementapp.repository;

import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryRepository extends JpaRepository<Battery, String> {
}
