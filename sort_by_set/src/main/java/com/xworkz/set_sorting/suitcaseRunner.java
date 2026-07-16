package com.xworkz.set_sorting;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class suitcaseRunner
{
    public static void main(String[] args)
    {
        SuitcaseDto suitcaseDto = new SuitcaseDto("Lg",5.6f,2000.45f,"Black");
        SuitcaseDto suitcaseDto1 = new SuitcaseDto("maby",7.6f,3000.45f,"red");
        SuitcaseDto suitcaseDto2 = new SuitcaseDto("bluestone",2.6f,3500.45f,"navy blue");
        SuitcaseDto suitcaseDto3 = new SuitcaseDto("blueSky",4.5f,2300.45f,"blue");
        SuitcaseDto suitcaseDto4 = new SuitcaseDto("AmericanTourister",6.0f,4500.00f,"Grey");
        SuitcaseDto suitcaseDto5 = new SuitcaseDto("Samsonite",5.8f,5500.00f,"Silver");
        SuitcaseDto suitcaseDto6 = new SuitcaseDto("VIP",4.2f,3200.00f,"Pink");
        SuitcaseDto suitcaseDto7 = new SuitcaseDto("Wildcraft",3.8f,2800.00f,"Green");
        SuitcaseDto suitcaseDto8 = new SuitcaseDto("Skybags",5.0f,3900.00f,"Orange");

        Set<SuitcaseDto> suitcaseSet = new HashSet<>();

        suitcaseSet.add(suitcaseDto);
        suitcaseSet.add(suitcaseDto1);
        suitcaseSet.add(suitcaseDto2);
        suitcaseSet.add(suitcaseDto3);
        suitcaseSet.add(suitcaseDto4);
        suitcaseSet.add(suitcaseDto5);

        System.out.println("size of set:"+suitcaseSet.size());
        suitcaseSet.forEach(System.out::println);


        System.out.println("----------------------------------------");
        LinkedHashSet<SuitcaseDto> linkedHashSet=new LinkedHashSet();
        linkedHashSet.add(suitcaseDto6);
        linkedHashSet.add(suitcaseDto7);
        linkedHashSet.add(suitcaseDto8);
        linkedHashSet.add(suitcaseDto6);//avoided

        linkedHashSet.forEach(System.out::println);


        System.out.println("-------------------------------------------");

        TreeSet<SuitcaseDto> treeSet = new TreeSet<>();//SuitcaseDto cannot be cast to java.lang.Comparable
        treeSet.add(suitcaseDto6);
        treeSet.add(suitcaseDto7);
        treeSet.add(suitcaseDto8);
        treeSet.forEach(System.out::println);


        System.out.println("-------------------------------------------");
    }

}
