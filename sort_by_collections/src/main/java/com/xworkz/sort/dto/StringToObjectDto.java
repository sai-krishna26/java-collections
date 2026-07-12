package com.xworkz.sort.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor

public class StringToObjectDto implements Comparable<StringToObjectDto>
{
    private String reference;

    @Override
    public int compareTo(StringToObjectDto o)
    {
        return o.reference.compareTo(this.reference);
    }
}
