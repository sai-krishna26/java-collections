package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class ChiefMinisterDto implements Serializable,Comparable<ChiefMinisterDto> {
    private String name;
    private String party;

    @Override
    public int compareTo(ChiefMinisterDto o) {
        return this.name.compareTo(o.name);
    }
}
