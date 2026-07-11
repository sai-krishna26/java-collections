package com.xworkz.sort.sort;

import com.xworkz.sort.dto.CricketDto;

import java.io.Serializable;
import java.util.Comparator;

public class CricketTeamNameComparator implements Comparator<CricketDto> {
    @Override
    public int compare(CricketDto o1, CricketDto o2) {
        return o1.getTeamName().compareToIgnoreCase(o2.getTeamName());
    }

    @Override
    public Comparator<CricketDto> reversed() {
        return Comparator.super.reversed();
    }
//    @Override
//    public int compare(CricketDto o1, CricketDto o2) {
//        return o2.getTeamName().compareToIgnoreCase(o1.getTeamName());
//    }
//
}
