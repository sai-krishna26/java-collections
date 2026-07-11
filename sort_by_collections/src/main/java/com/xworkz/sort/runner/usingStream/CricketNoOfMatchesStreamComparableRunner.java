package com.xworkz.sort.runner.usingStream;

import com.xworkz.sort.dto.CricketDto;
import com.xworkz.sort.sort.usingStreamSort.comparator.CricketCountryStreamComparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CricketNoOfMatchesStreamComparableRunner {
    public static void main(String[] args) {
        CricketDto cricketDto=new CricketDto(125,"India","India", LocalDate.of(2023,12,31),LocalDate.of(2023,12,31));
        CricketDto cricketDto2 = new CricketDto(150, "Australia", "Australia", LocalDate.of(2023, 1, 15), LocalDate.of(2023, 3, 20));
        CricketDto cricketDto3 = new CricketDto(83, "England", "England", LocalDate.of(2023, 2, 1), LocalDate.of(2023, 4, 15));
        CricketDto cricketDto4 = new CricketDto(77, "South Africa", "South Africa", LocalDate.of(2023, 3, 10), LocalDate.of(2023, 5, 25));
        CricketDto cricketDto5 = new CricketDto(67, "New Zealand", "New Zealand", LocalDate.of(2023, 4, 5), LocalDate.of(2023, 6, 30));
        CricketDto cricketDto6 = new CricketDto(53, "Pakistan", "Pakistan", LocalDate.of(2023, 5, 12), LocalDate.of(2023, 7, 20));
        CricketDto cricketDto7 = new CricketDto(41, "West Indies", "West Indies", LocalDate.of(2023, 6, 1), LocalDate.of(2023, 8, 15));
        CricketDto cricketDto8 = new CricketDto(44, "Sri Lanka", "Sri Lanka", LocalDate.of(2023, 7, 10), LocalDate.of(2023, 9, 25));
        CricketDto cricketDto9 = new CricketDto(33, "Bangladesh", "Bangladesh", LocalDate.of(2023, 8, 5), LocalDate.of(2023, 10, 30));
        CricketDto cricketDto10 = new CricketDto(311, "Zimbabwe", "Zimbabwe", LocalDate.of(2023, 9, 15), LocalDate.of(2023, 11, 20));

        List<CricketDto> listt=new ArrayList<>();
        listt.add(cricketDto2);
        listt.add(cricketDto3);
        listt.add(cricketDto4);
        listt.add(cricketDto5);
        listt.add(cricketDto6);
        listt.add(cricketDto7);
        listt.add(cricketDto8);
        listt.add(cricketDto9);
        listt.add(cricketDto10);
        listt.add(cricketDto);

//        listt.stream()
//                .filter(no-> no.getNoOfMatches() >50)
//                .sorted()
//                .forEach(System.out::println);


        listt.stream()
                .filter(cricketdto->cricketdto.getCountry().length()>4)
                .sorted(new CricketCountryStreamComparator())
                .forEach(System.out::println);

    }
}
