package com.xworkz.map.runner;

import com.xworkz.map.dto.MovieDto;

import java.util.HashMap;
import java.util.Map;

public class MovieRunner {
    public static void main(String[] args) {
        MovieDto movieDto = new MovieDto();
        Map<Integer, MovieDto> movie = new HashMap<>();
        movie.put(1, new MovieDto("KGF", "Yash"));
        movie.put(2, new MovieDto("Bahubali", "Prabhas"));
        movie.put(3, new MovieDto("RRR", "Ram Charan"));
        movie.put(4, new MovieDto("Pushpa", "Allu Arjun"));
        movie.put(5, new MovieDto("Salaar", "Prabhas"));
        movie.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(movie.keySet());
        System.out.println(movie.values());
        System.out.println("size of the map: " + movie.size());
        movie.clear();
        System.out.println("size after clear: " + movie.size());
    }
}
