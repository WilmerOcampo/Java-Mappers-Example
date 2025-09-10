package com.wo.modelmapper;

import com.wo.modelmapper.dto.PersonCustomDto;
import com.wo.modelmapper.entity.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main2 {

    public static void main(String[] args) {

        // Model Mapper Custom
        ModelMapper modelMapper = new ModelMapper();

        TypeMap<Person, PersonCustomDto> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDto.class);
        propertyMapper.addMapping(Person::getId, PersonCustomDto::setIdDTO);
        propertyMapper.addMapping(Person::getName, PersonCustomDto::setNameDTO);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDto::setLastNameDTO);
        propertyMapper.addMapping(Person::getEmail, PersonCustomDto::setEmailDTO);
        propertyMapper.addMapping(Person::getGender, PersonCustomDto::setGenderDTO);

        Person person = new Person(1L, "Wilmer", "Ocampo", "Wilmer@live.com", (byte) 25, 'M');
        System.out.println(person);

        // Si los atributos se llaman diferentes
        PersonCustomDto personCustomDto = propertyMapper.map(person);
        System.out.println(personCustomDto);
    }
}