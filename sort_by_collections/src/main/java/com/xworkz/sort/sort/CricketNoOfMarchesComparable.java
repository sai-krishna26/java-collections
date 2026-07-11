package com.xworkz.sort.sort;

import com.xworkz.sort.dto.CricketDto;
import com.xworkz.sort.sort.usingStreamSort.comparable.CricketNoOfMatchesStreamComparable;

import java.util.Comparator;

public class CricketNoOfMarchesComparable implements Comparator<CricketDto> {
    @Override
    public int compare(CricketDto o1,CricketDto o2) {
        return Comparator.comparing(CricketDto::getNoOfMatches).compare(o1,o2);
        // return Integer.compare(o1.getNoOfMatches(),o2.getNoOfMatches());
    }
}
