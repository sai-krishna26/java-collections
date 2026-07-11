package com.xworkz.sort.runner;

import com.xworkz.sort.dto.CricketDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CricketComparatorStreamSort {
    public static void main(String[] args) {
        System.out.println("=== Comparator + stream.sorted(comparator) ===");
        System.out.println("Sorting by noOfMatches (custom comparator)");

        CricketDto cricket1 = new CricketDto(123, "India", "India", LocalDate.of(2023, 12, 31), LocalDate.of(2023, 12, 31));
        CricketDto cricket2 = new CricketDto(100, "Australia", "Australia", LocalDate.of(2023, 1, 15), LocalDate.of(2023, 3, 20));
        CricketDto cricket3 = new CricketDto(85, "England", "England", LocalDate.of(2023, 2, 1), LocalDate.of(2023, 4, 15));
        CricketDto cricket4 = new CricketDto(75, "South Africa", "South Africa", LocalDate.of(2023, 3, 10), LocalDate.of(2023, 5, 25));
        CricketDto cricket5 = new CricketDto(60, "New Zealand", "New Zealand", LocalDate.of(2023, 4, 5), LocalDate.of(2023, 6, 30));

        List<CricketDto> cricketList = new ArrayList<>();
        cricketList.add(cricket1);
        cricketList.add(cricket2);
        cricketList.add(cricket3);
        cricketList.add(cricket4);
        cricketList.add(cricket5);

        System.out.println("\nBefore sorting:");
        cricketList.forEach(System.out::println);

        // Using Comparator with stream.sorted()
        Comparator<CricketDto> noOfMatchesComparator = (o1, o2) -> {
            System.out.println("Comparing: " + o1.getTeamName() + " (" + o1.getNoOfMatches() + ") with " + o2.getTeamName() + " (" + o2.getNoOfMatches() + ")");
            return Integer.compare(o1.getNoOfMatches(), o2.getNoOfMatches());
        };

        List<CricketDto> sortedCricketList = cricketList.stream()
                .sorted(noOfMatchesComparator)
                .collect(Collectors.toList());

        System.out.println("\nAfter sorting by noOfMatches (Comparator + Stream.sorted):");
        sortedCricketList.forEach(System.out::println);
    }
}
