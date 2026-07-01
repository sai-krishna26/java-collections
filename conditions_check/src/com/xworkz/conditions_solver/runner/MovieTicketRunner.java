package com.xworkz.conditions_solver.runner;

import com.xworkz.conditions_solver.dto.MovieTicketDto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class MovieTicketRunner {
    public static void main(String[] args) {
        List<MovieTicketDto> movieTickets = new ArrayList<>();
        List<MovieTicketDto> movieTickets1 = new ArrayList<>();

        //add
        movieTickets.add(new MovieTicketDto("King", 10, 100.0, LocalTime.of(12, 34, 21), "Btm Layout"));
        movieTickets.add(new MovieTicketDto("Godfather", 15, 150.0, LocalTime.of(18, 30, 00), "Bowenpally"));
        movieTickets.add(new MovieTicketDto("Star Wars", 20, 180.0, LocalTime.of(14, 00, 00), "BTM"));
        movieTickets.add(new MovieTicketDto("Titanic", 12, 120.0, LocalTime.of(16, 30, 00), "KPHB"));

        movieTickets1.add(new MovieTicketDto("Law", 2, 456.98, LocalTime.of(3, 4, 45), "Hsr Layout"));
        movieTickets1.add(new MovieTicketDto("Martin", 10, 100.0, LocalTime.of(12, 34, 21), "Btm Layout"));
        movieTickets1.add(new MovieTicketDto("Father", 15, 150.0, LocalTime.of(18, 30, 00), "Bowenpally"));
        movieTickets1.add(new MovieTicketDto("War of Lord", 20, 180.0, LocalTime.of(14, 00, 00), "BTM"));
        movieTickets1.add(new MovieTicketDto("Got", 12, 120.0, LocalTime.of(16, 30, 00), "KPHB"));
        System.out.println("-------------------------------------------------------------------");


        //addAll
        movieTickets1.addAll(movieTickets);
        movieTickets.addAll(movieTickets1);
        System.out.println(movieTickets1);
        System.out.println(movieTickets1.size());
        System.out.println("-------------------------------------------------------------------");

        //contains
        boolean check = movieTickets1.contains(movieTickets.getFirst());
        System.out.println("king in movieTickets1 list: " + check);
        System.out.println("-------------------------------------------------------------------");

        //containsAll
        boolean check1 = movieTickets.containsAll(movieTickets1);
        System.out.println("all elements in movieTickets1 list: " + check1);
        System.out.println("-------------------------------------------------------------------");

        //remove
        System.out.println("Before the single removal size of movieTickets: " + movieTickets.size());
        movieTickets.remove(movieTickets.get(0));
        //System.out.println("ater single remove:"+movieTickets);
        System.out.println("size after single remove:" + movieTickets.size());
        System.out.println("-------------------------------------------------------------------");


        //removeAll
        System.out.println("size of movieTickets1 before remove all: " + movieTickets1.size());
        movieTickets.removeAll(movieTickets1);
        System.out.println("After removeAll size of movieTickets1: " + movieTickets.size());
        System.out.println("-------------------------------------------------------------------");

        //isEmpty
        boolean check2 = movieTickets.isEmpty();
        System.out.println("is movieTickets empty: " + check2);

        boolean check3 = movieTickets1.isEmpty();
        System.out.println("is movieTickets1 empty: " + check3);
        System.out.println("-------------------------------------------------------------------");

        //add at specific index
        movieTickets.add(0, new MovieTicketDto("Thrones", 10, 100.0, LocalTime.of(12, 34, 21), "Madiwala"));
        //System.out.println("movieTicket dto status after add(index,dto):\n"+movieTickets);
        System.out.println("size after add(index,dto):" + movieTickets.size());
        System.out.println("-------------------------------------------------------------------");

        //add all at specific index
        movieTickets.addAll(1, movieTickets1);
        //System.out.println("movieTicket dto status after addAll:\n"+movieTickets);
        System.out.println("size after addAll:" + movieTickets.size());
        System.out.println("-------------------------------------------------------------------");

        //get() method
        System.out.println("element at index 1: " + movieTickets.get(1));
        System.out.println("-------------------------------------------------------------------");

        //set() method
        //System.out.println("element at index 2 before set(): \n"+movieTickets.get(2));
        movieTickets.set(2, new MovieTicketDto("RRR", 18, 150.0, LocalTime.of(5, 10, 20), "RTC X roads"));
        //System.out.println("element at inde 2 after set(): \n"+movieTickets.get(2));
        System.out.println("-------------------------------------------------------------------");

        //indexOf()
        System.out.println(movieTickets);
        System.out.println("index of \"RRR\": " + movieTickets.indexOf(new MovieTicketDto("RRR", 18, 150.0, LocalTime.of(5, 10, 20), "RTC X roads")));
        System.out.println("-------------------------------------------------------------------");


        //lastIndexOf()
        System.out.println("last index of \"RRR\": " + movieTickets.lastIndexOf(new MovieTicketDto("RRR", 18, 150.0, LocalTime.of(5, 10, 20), "RTC X roads")));
        System.out.println("-------------------------------------------------------------------");


        //listIterator(int index)
        ListIterator<MovieTicketDto> listIterator = movieTickets.listIterator(4);
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("-------------------------------------------------------------------");

        //sub list
        List<MovieTicketDto> subList = movieTickets.subList(0, 2);
        System.out.println("sub list: \n" + subList);
        System.out.println("-------------------------------------------------------------------");

        //sort
       // System.out.println(movieTickets.sort(Comparator.comparingInt(MovieTicketDto::getTicketCount));

    }
}
