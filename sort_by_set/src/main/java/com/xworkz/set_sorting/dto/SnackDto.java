package com.xworkz.set_sorting.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SnackDto implements Comparable<SnackDto>
{
    private String name;
    private String flavor;
    private double weight;
    private double price;

    @Override
    public int compareTo(SnackDto o)
    {
        return this.name.compareTo(o.name);
    }
}
