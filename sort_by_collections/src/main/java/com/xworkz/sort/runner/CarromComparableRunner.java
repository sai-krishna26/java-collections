package com.xworkz.sort.runner;

import com.xworkz.sort.dto.CarromDto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CarromComparableRunner{
    public static void main(String[] args) {
        CarromDto carromDto=new CarromDto(1,"Red",100.0,"X");
        CarromDto carromDto1=new CarromDto(2,"Blue",200.0,"Y");
        CarromDto carromDto2=new CarromDto(3,"Green",300.0,"Z");
        CarromDto carromDto3=new CarromDto(4,"Yellow",400.0,"A");
        CarromDto carromDto4=new CarromDto(5,"Black",500.0,"B");

        List<CarromDto> carromDtoList=new LinkedList<>();
        carromDtoList.add(carromDto);
        carromDtoList.add(carromDto1);
        carromDtoList.add(carromDto2);
        carromDtoList.add(carromDto3);
        carromDtoList.add(carromDto4);


        Collections.sort(carromDtoList);
        carromDtoList.forEach(System.out::println);
    }
}
