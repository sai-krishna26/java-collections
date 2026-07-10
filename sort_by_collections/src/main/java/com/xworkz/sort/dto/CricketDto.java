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
public class CricketDto implements Serializable, Comparator<CricketDto> {
    private int noOfMatches;
    private String teamName;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;

    @Override
    public int compare(CricketDto o1, CricketDto o2) {
        return Integer.compare(o1.noOfMatches,o2.noOfMatches);
    }
}
