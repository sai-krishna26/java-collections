package com.xworkz.sort.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CarromDto implements Serializable, Comparable<CarromDto>
{
    private int size;
    private String colour;
    private double price;
    private String brand;

    @Override
    public int compareTo(CarromDto o) {   //to sort the strings in ascending or descending order
        CarromDto left = this;
        //CarromDto right=o;
        return o.colour.compareTo(this.colour);//return right.colour.compareTo(left.colour);
    }
}

    /* to sort the integer values in ascending or descending order
    public int compare(CarromDto o) {
        return this.size - o.size;
    }*/

