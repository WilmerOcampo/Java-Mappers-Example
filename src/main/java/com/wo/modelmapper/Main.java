package com.wo.modelmapper;

import com.wo.modelmapper.dto.PersonCustomDto;
import com.wo.modelmapper.dto.PersonDefaultDto;
import com.wo.modelmapper.entity.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {

    public static void main(String[] args) {

        // Model Mapper Default
        ModelMapper modelMapper = new ModelMapper();

        Person person = new Person(1L, "Wilmer", "Ocampo", "Wilmer@live.com", (byte) 25, 'M');
        System.out.println(person);

        // Si los atributos se llaman igual
        PersonDefaultDto personDefaultDto = modelMapper.map(person, PersonDefaultDto.class);
        System.out.println(personDefaultDto);
    }
}