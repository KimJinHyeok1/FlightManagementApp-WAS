package com.example.flightmanagementapp.repository;

import com.example.flightmanagementapp.domain.aircraft.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorRepository extends JpaRepository<Person, Integer> {
}
