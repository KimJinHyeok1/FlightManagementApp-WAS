package com.example.flightmanagementapp.services;

import com.example.flightmanagementapp.domain.aircraft.Dto.OperatorDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Person;
import com.example.flightmanagementapp.domain.aircraft.mapper.PersonMapper;
import com.example.flightmanagementapp.repository.OperatorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OperatorService {

    private final OperatorRepository operatorRepository;

    public List<Person> getAllOperators() { return operatorRepository.findAll(); }

    public ResponseEntity<Person> createOperatorData(OperatorDto operatorDto) {
        return ResponseEntity.ok(operatorRepository.save(
                PersonMapper.MAPPER.
                        toEntity(operatorDto)));
    }

    public HttpStatus deleteOperatorData(int operatorId) {
      operatorRepository.deleteById(operatorId);
      return HttpStatus.OK;
    }
}
