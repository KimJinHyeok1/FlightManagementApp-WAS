package com.example.flightmanagementapp.domain.aircraft.mapper;

import com.example.flightmanagementapp.domain.aircraft.Dto.OperatorDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Person;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PersonMapper {

    PersonMapper MAPPER = Mappers.getMapper(PersonMapper.class);

    @Named("toDto")
    OperatorDto toDto(Person person);

    @IterableMapping(qualifiedByName = "toDto")
    List<OperatorDto> toDtoList(List<Person> people);

    @Named("toEntity")
    Person toEntity(OperatorDto operatorDto);
}
