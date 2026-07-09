package com.xworkz.sort.runner;

import com.xworkz.sort.dto.CricketDto;
import com.xworkz.sort.sort.NumberOfMatchesSorter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CricketDtoRunner {
    public static void main(String[] args) {
        CricketDto cricketDto=new CricketDto(123,"India","India", LocalDate.of(2023,12,31),LocalDate.of(2023,12,31));
        CricketDto cricketDto2 = new CricketDto(100, "Australia", "Australia", LocalDate.of(2023, 1, 15), LocalDate.of(2023, 3, 20));
        CricketDto cricketDto3 = new CricketDto(85, "England", "England", LocalDate.of(2023, 2, 1), LocalDate.of(2023, 4, 15));
        CricketDto cricketDto4 = new CricketDto(75, "South Africa", "South Africa", LocalDate.of(2023, 3, 10), LocalDate.of(2023, 5, 25));
        CricketDto cricketDto5 = new CricketDto(60, "New Zealand", "New Zealand", LocalDate.of(2023, 4, 5), LocalDate.of(2023, 6, 30));
        CricketDto cricketDto6 = new CricketDto(55, "Pakistan", "Pakistan", LocalDate.of(2023, 5, 12), LocalDate.of(2023, 7, 20));
        CricketDto cricketDto7 = new CricketDto(45, "West Indies", "West Indies", LocalDate.of(2023, 6, 1), LocalDate.of(2023, 8, 15));
        CricketDto cricketDto8 = new CricketDto(40, "Sri Lanka", "Sri Lanka", LocalDate.of(2023, 7, 10), LocalDate.of(2023, 9, 25));
        CricketDto cricketDto9 = new CricketDto(35, "Bangladesh", "Bangladesh", LocalDate.of(2023, 8, 5), LocalDate.of(2023, 10, 30));
        CricketDto cricketDto10 = new CricketDto(30, "Zimbabwe", "Zimbabwe", LocalDate.of(2023, 9, 15), LocalDate.of(2023, 11, 20));

        List<CricketDto> list=new ArrayList<>();
        list.add(cricketDto2);
        list.add(cricketDto3);
        list.add(cricketDto4);
        list.add(cricketDto5);
        list.add(cricketDto6);
        list.add(cricketDto7);
        list.add(cricketDto8);
        list.add(cricketDto9);
        list.add(cricketDto10);
        list.add(cricketDto);

        Comparator<CricketDto> teamNameComparator=(o1,o2)->
        {
            System.out.println("comparing :"+o1 +" with"+o2);
            return o2.getTeamName().compareTo(o1.getTeamName());
        };

        Collections.sort(list,teamNameComparator);

        list.forEach((cricket)-> System.out.println(cricket));
    }
}
