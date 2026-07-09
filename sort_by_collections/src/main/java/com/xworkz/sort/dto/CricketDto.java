package com.xworkz.sort.dto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CricketDto implements Serializable,Comparable<CricketDto>{
    private int noOfMatches;
    private String teamName;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;


    @Override
    public int compareTo(CricketDto o) {
        CricketDto left=this;
        CricketDto right=o;
        return left.country.compareTo(right.country);
    }
}
