package com.wo.modelmapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDefaultDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Byte age;
    private Character gender;
}