package com.xworkz.set_sorting.impl;

import com.xworkz.set_sorting.dto.SnackDto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SnackDtoRunner
{
    public static void main(String[] args)
    {
        Set<SnackDto> snackSet = new HashSet<>();
        snackSet.add(new SnackDto("Masala puri","masala",10.5,40));
        snackSet.add(new SnackDto("Pani puri","salt",8.9,40));
        snackSet.add(new SnackDto("Samosa","mixed",12.98,20));
        snackSet.add(new SnackDto("bhel","spicy",15.98,45));
        snackSet.add(new SnackDto("roll","spicy",16.98,50));
        snackSet.add(new SnackDto("roll","spicy",16.98,50));

        System.out.println(snackSet.size());
        snackSet.forEach(System.out::println);

    }
}
