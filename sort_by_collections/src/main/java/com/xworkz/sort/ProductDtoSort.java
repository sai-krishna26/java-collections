package com.xworkz.sort;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDtoSort{
    public static void main(String[] args) {
        List<ProductDto> list=new ArrayList<>();
        list.add(new ProductDto(245,"Laptop",120000.00,true, LocalDate.of(2025,12,31)));
        list.add(new ProductDto(246,"Mobile",25000.00,true,LocalDate.of(2022,5,24)));
        list.add(new ProductDto(247,"Headphone",15000.00,true,LocalDate.of(2023,10,15)));
        list.add(new ProductDto(248,"Camera",120000.00,true, LocalDate.of(2025,12,31)));
        list.add(new ProductDto(249,"Tablet",80000.00,true, LocalDate.of(2024,11,22)));

        Collections.sort(list);

        list.forEach((product)->{System.out.println(product);});
    }
}
