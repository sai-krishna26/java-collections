package com.xworkz.sort.sort;

import com.xworkz.sort.dto.CricketDto;

import java.util.Comparator;

public class CricketEndDateComparator implements Comparator<CricketDto>
{
    @Override
    public int compare(CricketDto o1, CricketDto o2) {
        return o2.getEndDate().compareTo(o1.getEndDate());
    }
}
