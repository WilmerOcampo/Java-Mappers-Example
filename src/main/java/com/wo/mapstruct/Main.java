package com.wo.mapstruct;

import com.wo.mapstruct.dto.PersonDefaultDto;
import com.wo.mapstruct.entity.Person;
import com.wo.mapstruct.mapper.PersonMapper;

public class Main {

    public static void main(String[] args) {

        // MapStruct Default
        Person person = new Person(1L, "Wilmer", "Ocampo", "Wilmer@live.com", (byte) 25, 'M');
        System.out.println(person);

        // Si los atributos se llaman iguales
        PersonDefaultDto personDefaultDto = PersonMapper.INSTANCE.personToPersonDefaultDTO(person);
        System.out.println(personDefaultDto);
    }
}