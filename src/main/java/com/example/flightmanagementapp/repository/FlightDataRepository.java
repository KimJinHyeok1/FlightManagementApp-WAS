package com.example.flightmanagementapp.repository;

import com.example.flightmanagementapp.domain.aircraft.Entity.FlightData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightDataRepository extends JpaRepository<FlightData, String> {
    List<FlightData> findByAircraft_AircraftNameEquals(String aircraftName);

    List<FlightData> findByFlightDataOperator_ExternalPilot_NameEqualsOrFlightDataOperator_InternalPilot_NameEquals
            (String OperatorName,
             String OperatorName2);

    List<FlightData> findByFlightDateBetween(LocalDate startDate, LocalDate endDate);
}

