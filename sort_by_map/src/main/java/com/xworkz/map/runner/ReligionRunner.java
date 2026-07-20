package com.xworkz.map.runner;

import com.xworkz.map.dto.ReligionDto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReligionRunner {
    public static void main(String[] args) {
        ReligionDto religionDto = new ReligionDto();
        Map<Integer, ReligionDto> religion = new HashMap<>();
        religion.put(1, new ReligionDto("Hinduism", Arrays.asList("Shiva", "Vishnu", "Brahma")));
        religion.put(2, new ReligionDto("Christianity", Arrays.asList("Jesus", "Mary", "God")));
        religion.put(3, new ReligionDto("Islam", Arrays.asList("Allah", "Muhammad")));
        religion.put(4, new ReligionDto("Buddhism", Arrays.asList("Buddha")));
        religion.put(5, new ReligionDto("Sikhism", Arrays.asList("Guru Nanak", "Waheguru")));
        religion.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(religion.keySet());
        System.out.println(religion.values());
        System.out.println("size of the map: " + religion.size());
        religion.clear();
        System.out.println("size after clear: " + religion.size());
    }
}
