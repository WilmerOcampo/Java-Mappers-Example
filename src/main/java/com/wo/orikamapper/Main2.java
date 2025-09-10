package com.wo.orikamapper;

import com.wo.orikamapper.dto.PersonCustomDto;
import com.wo.orikamapper.entity.Person;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Main2 {

    public static void main(String[] args) {

        // Orika Mapper Custom
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(Person.class, PersonCustomDto.class)
                .field("id", "idDTO")
                .field("name", "nameDTO")
                .field("lastName", "lastNameDTO")
                .field("email", "emailDTO")
                .field("age", "ageDTO")
                .field("gender", "genderDTO")
                .byDefault()
                .register();

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();

        Person person = new Person(1L, "Wilmer", "Ocampo", "Wilmer@live.com", (byte) 25, 'M');
        System.out.println(person);

        // Si los atributos se llaman diferentes
        PersonCustomDto personCustomDto = mapperFacade.map(person, PersonCustomDto.class);
        System.out.println(personCustomDto);
    }
}