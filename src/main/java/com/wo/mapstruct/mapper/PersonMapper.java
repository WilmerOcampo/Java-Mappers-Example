package com.wo.mapstruct.mapper;

import com.wo.mapstruct.dto.PersonCustomDto;
import com.wo.mapstruct.dto.PersonDefaultDto;
import com.wo.mapstruct.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    // Con atributos iguales
    PersonDefaultDto personToPersonDefaultDTO(Person person);

    // Con atributos diferentes
    @Mapping(source = "id", target = "idDTO")
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "email", target = "emailDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDto personToPersonCustomDto(Person person);
}
