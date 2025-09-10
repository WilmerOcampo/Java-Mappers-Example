package com.wo.orikamapper;

import com.wo.orikamapper.dto.PersonCustomDto;
import com.wo.orikamapper.dto.PersonDefaultDto;
import com.wo.orikamapper.entity.Person;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Main {

    public static void main(String[] args) {

        // Orika Mapper Default
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Person.class, PersonDefaultDto.class);

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        Person person = new Person(1L, "Wilmer", "Ocampo", "Wilmer@live.com", (byte) 25, 'M');
        System.out.println(person);

        // Si los atributos se llaman iguales
        PersonDefaultDto personDefaultDto = mapperFacade.map(person, PersonDefaultDto.class);
        System.out.println(personDefaultDto);
    }
}