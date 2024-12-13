package com.example.flightmanagementapp.domain.aircraft.mapper;

import com.example.flightmanagementapp.domain.aircraft.Dto.AircraftDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Aircraft;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AircraftMapper {

    AircraftMapper MAPPER = Mappers.getMapper(AircraftMapper.class);

    @Named("toDto")
    AircraftDto toDto(Aircraft aircraft);

    @IterableMapping(qualifiedByName = "toDto")
    List<AircraftDto> toDtoList(List<Aircraft> aircrafts);

    @Named("toEntity")
    @Mapping(source = "aircraftDto.aircraftRegisterNum" , target = "aircraftRegisterNum")
    @Mapping(source = "aircraftDto.aircraftSerialNum" , target = "aircraftSerialNum")
    @Mapping(source = "aircraftDto.aircraftMTOW" , target = "aircraftMTOW")
    Aircraft toEntity(AircraftDto aircraftDto);
}
