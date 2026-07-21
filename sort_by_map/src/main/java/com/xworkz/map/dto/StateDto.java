package com.xworkz.map.dto;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@EqualsAndHashCode
public class StateDto implements Serializable,Comparable<StateDto> {
    private String stateName;
    private String capital;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StateDto))  return false;

        StateDto stateDto=(StateDto)obj;
        return stateName.equals(stateDto.stateName) && capital.equals(stateDto.capital);
    }

    @Override
    public int hashCode() {
        int result= Objects.hashCode(stateName);
        result=31*result+Objects.hashCode(capital);
        return result;
    }

    @Override
    public int compareTo(StateDto o) {
        return this.stateName.compareTo(o.stateName) ;
    }
}
