package com.wo.mapstruct;

import com.wo.mapstruct.dto.PersonCustomDto;
import com.wo.mapstruct.entity.Person;
import com.wo.mapstruct.mapper.PersonMapper;

public class Main2 {

    public static void main(String[] args) {

        // MapStruct Custom
        Person person = new Person(1L, "Wilmer", "Ocampo", "Wilmer@live.com", (byte) 25, 'M');
        System.out.println(person);

        // Si los atributos se llaman diferentes
        PersonCustomDto personCustomDto = PersonMapper.INSTANCE.personToPersonCustomDto(person);
        System.out.println(personCustomDto);
    }
}