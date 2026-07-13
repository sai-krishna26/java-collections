package com.xworkz.sort.sort.usingStreamSort.comparator;

import com.xworkz.sort.dto.DiseaseDto;

import java.util.Comparator;

public class DiseaseEtiologyComparator implements Comparator<DiseaseDto> {
    @Override
    public int compare(DiseaseDto o1, DiseaseDto o2) {
        return o2.getEtiology().compareTo(o1.getEtiology());
    }
}
