package com.xworkz.sort.sort;

import com.xworkz.sort.dto.CricketDto;

import java.io.Serializable;
import java.util.Comparator;

public class CricketStartDateComparator implements Serializable, Comparator<CricketDto> {
    @Override
    public int compare(CricketDto o1, CricketDto o2) {
        return o2.getStartDate().compareTo(o1.getStartDate());
    }
}
