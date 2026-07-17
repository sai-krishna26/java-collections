package com.xworkz.set_sorting.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SuitcaseDto implements Comparable<SuitcaseDto> {

    private String brand_name;
    private float capacity;
    private float price;
    private String color;

    @Override
    public int compareTo(SuitcaseDto o) {
        return this.brand_name.compareTo(o.brand_name);
    }
}
