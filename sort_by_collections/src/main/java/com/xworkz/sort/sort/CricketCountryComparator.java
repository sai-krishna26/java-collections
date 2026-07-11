package com.xworkz.sort.sort;

import com.xworkz.sort.dto.CricketDto;

import java.util.Collections;
import java.util.Comparator;

public class CricketCountryComparator implements Comparator<CricketDto>
{
    @Override
    public int compare(CricketDto o1, CricketDto o2)
    {
        return o2.getCountry().compareTo(o1.getCountry());
    }
    //Comparator<CricketDto> byCountry=(o1, o2)->
    //        o2.getCountry().compareTo(o1.getCountry());
}
