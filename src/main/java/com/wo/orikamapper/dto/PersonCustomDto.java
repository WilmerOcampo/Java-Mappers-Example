package com.wo.orikamapper.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCustomDto {
    private Long idDTO;
    private String nameDTO;
    private String lastNameDTO;
    private String emailDTO;
    private Byte ageDTO;
    private Character genderDTO;
}
