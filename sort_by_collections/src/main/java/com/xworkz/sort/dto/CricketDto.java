package com.xworkz.sort.dto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CricketDto implements Serializable, Comparable<CricketDto> {
    private int noOfMatches;
    private String teamName;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;

    @Override
    public int compareTo(CricketDto o) {
        return Integer.compare(o.noOfMatches, this.noOfMatches);
        //or return this.noOfMatches - o.noOfMatches;
    }
}
