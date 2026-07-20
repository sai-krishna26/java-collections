package com.xworkz.map.runner;

import com.xworkz.map.dto.UserDto;

import java.util.HashMap;
import java.util.Map;

public class UserRunner {
    public static void main(String[] args) {
        UserDto userDto = new UserDto();
        Map<Integer, UserDto> user = new HashMap<>();
        user.put(1, new UserDto("ramu@gmail.com", "Ramu"));
        user.put(2, new UserDto("banti@yahoo.com", "Banti"));
        user.put(3, new UserDto("kiku@alibaba.com", "Kiku"));
        user.put(4, new UserDto("hari@gmail.com", "Hari"));
        user.put(5, new UserDto("shamu@outlook.com", "Shamu"));
        user.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(user.keySet());
        System.out.println(user.values());
        System.out.println("size of the map: " + user.size());
        user.clear();
        System.out.println("size after clear: " + user.size());
    }
}
