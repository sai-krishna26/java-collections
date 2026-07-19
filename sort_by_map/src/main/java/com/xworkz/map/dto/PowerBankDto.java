package com.xworkz.map.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PowerBankDto {
    private String brand;
    private int capacity;
    private String color;
    private double price;
}
