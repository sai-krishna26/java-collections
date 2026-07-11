package com.xworkz.sort.sort.usingStreamSort.comparator;

import com.xworkz.sort.dto.CricketDto;

import java.util.Comparator;

public class CricketCountryStreamComparator implements Comparator<CricketDto>
{

    @Override
    public int compare(CricketDto o1, CricketDto o2) {
        return o2.getCountry().compareTo(o1.getCountry());
    }
}
