package com.xworkz.streamapi.filter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WarDtoRunner
{
    public static void main(String[] args) {
        List<WarDTO> wars = new ArrayList<>();
        wars.add(new WarDTO("World War I", LocalDate.of(1914, 7, 28), LocalDate.of(1918, 11, 11), "Europe",
                Arrays.asList("Germany", "France", "UK", "Russia", "USA"), 17000000, "Allied Victory", 1570, "General Foch", "Assassination"));
        wars.add(new WarDTO("World War II", LocalDate.of(1939, 9, 1), LocalDate.of(1945, 9, 2), "Global",
                Arrays.asList("Germany", "Japan", "Italy", "USA", "UK", "USSR", "China"), 85000000, "Allied Victory", 2193, "Eisenhower", "Expansionism"));
        wars.add(new WarDTO("Napoleonic Wars", LocalDate.of(1803, 5, 18), LocalDate.of(1815, 11, 20), "Europe",
                Arrays.asList("France", "UK", "Russia", "Prussia", "Austria"), 3500000, "Coalition Victory", 4580, "Napoleon", "Expansion"));
        wars.add(new WarDTO("American Civil War", LocalDate.of(1861, 4, 12), LocalDate.of(1865, 4, 9), "North America",
                Arrays.asList("USA", "Confederate States"), 750000, "Union Victory", 1488, "Grant", "Slavery"));
        wars.add(new WarDTO("Korean War", LocalDate.of(1950, 6, 25), LocalDate.of(1953, 7, 27), "Asia",
                Arrays.asList("North Korea", "South Korea", "USA", "China"), 2500000, "Stalemate", 1128, "MacArthur", "Ideology"));
        wars.add(new WarDTO("Vietnam War", LocalDate.of(1955, 11, 1), LocalDate.of(1975, 4, 30), "Asia",
                Arrays.asList("Vietnam", "USA", "USSR", "China"), 1800000, "North Victory", 7170, "Westmoreland", "Ideology"));
        wars.add(new WarDTO("Gulf War", LocalDate.of(1990, 8, 2), LocalDate.of(1991, 2, 28), "Middle East",
                Arrays.asList("Iraq", "USA", "UK", "France", "Saudi Arabia"), 25000, "Coalition Victory", 209, "Schwarzkopf", "Invasion"));
        wars.add(new WarDTO("Six-Day War", LocalDate.of(1967, 6, 5), LocalDate.of(1967, 6, 10), "Middle East",
                Arrays.asList("Israel", "Egypt", "Jordan", "Syria"), 20000, "Israeli Victory", 6, "Dayan", "Territorial"));
        wars.add(new WarDTO("Falklands War", LocalDate.of(1982, 4, 2), LocalDate.of(1982, 6, 14), "South Atlantic",
                Arrays.asList("UK", "Argentina"), 900, "UK Victory", 74, "Thompson", "Territorial"));
        wars.add(new WarDTO("Indo-Pak War 1971", LocalDate.of(1971, 12, 3), LocalDate.of(1971, 12, 16), "Asia",
                Arrays.asList("India", "Pakistan", "Bangladesh"), 3000, "Indian Victory", 13, "Manekshaw", "Independence"));


        System.out.println("---------------BASIC PROPERTY FILTERING------------");

        System.out.println("\n--- Wars starting with W ---");
        wars.stream()
                .filter(war -> war.getWarName().startsWith("W"))
                .forEach(war -> System.out.println(war.getWarName()));


        System.out.println("\n--- Wars fought in Europe ---");
        wars.stream()
                .filter(war -> war.getLocation().equals("Europe"))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getLocation()));


        System.out.println("\n--- Wars with outcome containing 'Victory' ---");
        wars.stream()
                .filter(war -> war.getOutcome().contains("Victory"))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getOutcome()));


        System.out.println("\n--- Wars led by Napoleon ---");
        wars.stream()
                .filter(war -> war.getCommander().equals("Napoleon"))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCommander()));


        System.out.println("\n--- Wars caused by 'Territorial' dispute ---");
        wars.stream()
                .filter(war -> war.getReason().contains("Territorial"))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getReason()));


        System.out.println("\n------------------DATE-BASED FILTERING--------------");

        System.out.println("\n--- Wars that started after 1900 ---");
        wars.stream()
                .filter(war -> war.getStartDate().isAfter(LocalDate.of(1900, 1, 1)))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getStartDate()));


        System.out.println("\n--- Wars that ended before 1800 ---");
        wars.stream()
                .filter(war -> war.getEndDate().isBefore(LocalDate.of(1800, 1, 1)))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getEndDate()));


        System.out.println("\n--- Wars in the 20th century ---");
        wars.stream()
                .filter(war -> war.getStartDate().getYear() >= 1901 && war.getStartDate().getYear() <= 2000)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getStartDate().getYear()));

        // Filter wars with duration > 365 days
        System.out.println("\n--- Wars with duration > 365 days ---");
        wars.stream()
                .filter(war -> war.getDurationDays() > 365)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getDurationDays() + " days"));


        System.out.println("\n--- Wars with duration < 30 days ---");
        wars.stream()
                .filter(war -> war.getDurationDays() < 30)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getDurationDays() + " days"));


        System.out.println("\n------------NUMERICAL FILTERING-----------");


        System.out.println("\n--- Wars with casualties > 100,000 ---");
        wars.stream()
                .filter(war -> war.getCasualties() > 100000)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCasualties()));


        System.out.println("\n--- Wars with casualties < 10,000 ---");
        wars.stream()
                .filter(war -> war.getCasualties() < 10000)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCasualties()));


        System.out.println("\n--- Wars with casualties between 50,000-500,000 ---");
        wars.stream()
                .filter(war -> war.getCasualties() >= 50000 && war.getCasualties() <= 500000)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCasualties()));


        System.out.println("\n--- Wars with duration divisible by7 ---");
        wars.stream()
                .filter(war -> war.getDurationDays() % 7 == 0)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getDurationDays() + " days"));

        System.out.println("\n------------COLLECTION-BASED FILTERING------------");


        System.out.println("\n--- Wars involving India ---");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().contains("India"))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCountriesInvolved()));

        System.out.println("\n--- Wars involving more than 3 countries ---");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().size() > 3)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCountriesInvolved().size() + " countries"));


        System.out.println("\n--- Wars involving exactly 2 countries ---");
        wars.stream()
                .filter(war -> war.getCountriesInvolved().size() == 2)
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCountriesInvolved()));

        System.out.println("\n--------------ADVANCED/COMPLEX FILTERING---------");


        System.out.println("\n--- Wars with casualties > 50,000 AND duration > 100 days ---");
        wars.stream()
                .filter(war -> war.getCasualties() > 50000 && war.getDurationDays() > 100)
                .forEach(war -> System.out.println(war.getWarName() + ": Casualties=" + war.getCasualties() + ", Duration=" + war.getDurationDays()));


        System.out.println("\n--- Wars where commander contains 'Gen' ---");
        wars.stream()
                .filter(war -> war.getCommander().contains("Gen"))
                .forEach(war -> System.out.println(war.getWarName() + ": " + war.getCommander()));


        System.out.println("\n--- Wars in Asia with Victory outcome and casualties > 10,000 ---");
        wars.stream()
                .filter(war -> war.getLocation().equals("Asia")
                        && war.getOutcome().contains("Victory")
                        && war.getCasualties() > 10000)
                .forEach(war -> System.out.println(war.getWarName() + ": Location=" + war.getLocation() + ", Outcome=" + war.getOutcome() + ", Casualties=" + war.getCasualties()));

    }
}
