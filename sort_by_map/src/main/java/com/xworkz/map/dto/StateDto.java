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
public class StateDto implements Serializable {
    private String stateName;
    private String capital;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof StateDto))  return false;

        StateDto stateDto=(StateDto)obj;
        return stateName.equals(stateDto.stateName);
    }

    @Override
    public int hashCode() {
        int result= Objects.hashCode(stateName);
        result=31*result+Objects.hashCode(capital);
        return result;
    }
}
