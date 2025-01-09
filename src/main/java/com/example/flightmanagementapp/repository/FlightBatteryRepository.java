package com.example.flightmanagementapp.repository;

import com.example.flightmanagementapp.domain.aircraft.Entity.FlightBattery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightBatteryRepository  extends JpaRepository<FlightBattery, Integer>  {
    void deleteByBattery_BatterySerialNumEquals(String batterySerialNum);
}
