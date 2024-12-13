package com.example.flightmanagementapp.domain.aircraft.mapper;

import com.example.flightmanagementapp.domain.aircraft.Dto.BatteryDto;
import com.example.flightmanagementapp.domain.aircraft.Entity.Battery;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BatteryMapper {

    BatteryMapper MAPPER = Mappers.getMapper(BatteryMapper.class);


    @Named("toDto")
    BatteryDto toDto(Battery battery);

    @IterableMapping(qualifiedByName = "toDto")
    List<BatteryDto> toDtoList(List<Battery> batteries);

    @Named("toEntity")
    @Mapping(source = "batteryDto.batterySerialNum", target = "batterySerialNum")
    @Mapping(source = "batteryDto.batteryType", target = "batteryType")
    @Mapping(source = "batteryDto.batteryCell", target = "batteryCell")
    @Mapping(source = "batteryDto.batteryCapacity", target = "batteryCapacity")
    Battery toEntity(BatteryDto batteryDto);

}
