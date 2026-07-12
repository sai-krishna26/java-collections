package com.xworkz.sort.sort.usingStreamSort.comparator;

import com.xworkz.sort.dto.DiseaseDto;

import java.util.Comparator;

public class DiseaseNameComparator implements Comparator<DiseaseDto> {

    @Override
    public int compare(DiseaseDto o1, DiseaseDto o2) {
        /* to avoid NullpointerException return Comparator
                .comparing(DiseaseDto::getName,Comparator
                        .nullsLast(String::compareTo)).compare(o2,o1); */
         return o2.getName().compareToIgnoreCase(o1.getName());
    }
}
