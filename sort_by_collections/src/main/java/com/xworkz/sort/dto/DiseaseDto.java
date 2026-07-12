package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DiseaseDto implements Serializable,Comparable<DiseaseDto> {

    private int id;
    private String name;
    private String description;
    private String symptoms;
    private String cause;
    private String treatment;
    private String cure;
    private String prevention;
    private String etiology;

    @Override
    public int compareTo(DiseaseDto o) {
        return Integer.compare(this.id,o.id);
    }
}