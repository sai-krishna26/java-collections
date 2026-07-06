package com.xworkz.streamapi;

import java.util.Arrays;
import java.util.List;

public class WithStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4, 5, 6, 8, 9, 20);
        list.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
