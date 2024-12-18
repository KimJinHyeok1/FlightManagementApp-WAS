package com.example.flightmanagementapp.domain.aircraft.mapper;

import com.example.flightmanagementapp.domain.aircraft.Dto.FlightDataDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.FlightData;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface FlightDataMapper {
    FlightDataMapper MAPPER = Mappers.getMapper(FlightDataMapper.class);

    @Named("toDto")
    FlightDataDto toDto(FlightData flightData);

    @IterableMapping(qualifiedByName = "toDto")
    List<FlightDataDto> toDtoList(List<FlightData> flightData);

    @Named("toEntity")
    FlightData toEntity(FlightDataDto flightDataDto);

}
