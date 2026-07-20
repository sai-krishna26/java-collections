package com.xworkz.map.runner;

import com.xworkz.map.dto.HouseDto;

import java.util.HashMap;
import java.util.Map;

public class HouseRunner {
    public static void main(String[] args) {
        HouseDto houseDto = new HouseDto();
        Map<Integer, HouseDto> house = new HashMap<>();
        house.put(1, new HouseDto("Indiranagar", "123"));
        house.put(2, new HouseDto("Koramangala", "456"));
        house.put(3, new HouseDto("HSR Layout", "789"));
        house.put(4, new HouseDto("Whitefield", "101"));
        house.put(5, new HouseDto("Jayanagar", "202"));
        house.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(house.keySet());
        System.out.println(house.values());
        System.out.println("size of the map: " + house.size());
        house.clear();
        System.out.println("size after clear: " + house.size());
    }
}
