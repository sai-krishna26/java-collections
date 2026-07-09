package com.xworkz.sort.sort;

import com.xworkz.sort.dto.CricketDto;

import java.util.Comparator;

public class NumberOfMatchesSorter implements Comparator<CricketDto> {

    @Override
    public int compare(CricketDto o1, CricketDto o2) {
        return Integer.compare(o1.getNoOfMatches(),o2.getNoOfMatches());
    }
}
