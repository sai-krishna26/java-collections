package com.xworkz.map.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ReligionDto {
    private String religion;
    private List<String> godList;
}
