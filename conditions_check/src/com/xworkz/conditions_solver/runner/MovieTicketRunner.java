package com.xworkz.conditions_solver.runner;

import com.xworkz.conditions_solver.dto.MovieTicketDto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MovieTicketRunner {
    public static void main(String[] args) {
        List<MovieTicketDto> movieTickets = new ArrayList<>();
        List<MovieTicketDto> movieTickets1 = new ArrayList<>();

        //add
        movieTickets.add(new MovieTicketDto("King", 10, 100.0, LocalTime.of(12,34,21), "Btm Layout"));
        movieTickets.add(new MovieTicketDto("Godfather", 15, 150.0, LocalTime.of(18,30,00), "Bowenpally"));
        movieTickets.add(new MovieTicketDto("Star Wars", 20, 180.0, LocalTime.of(14,00,00), "BTM"));
        movieTickets.add(new MovieTicketDto("Titanic", 12, 120.0, LocalTime.of(16,30,00), "KPHB"));

        movieTickets1.add(new MovieTicketDto("Law",2,456.98,LocalTime.of(3,4,45),"Hsr Layout"));
        movieTickets1.add(new MovieTicketDto("Martin", 10, 100.0, LocalTime.of(12,34,21), "Btm Layout"));
        movieTickets1.add(new MovieTicketDto("Father", 15, 150.0, LocalTime.of(18,30,00), "Bowenpally"));
        movieTickets1.add(new MovieTicketDto("War of Lord", 20, 180.0, LocalTime.of(14,00,00), "BTM"));
        movieTickets1.add(new MovieTicketDto("Got", 12, 120.0, LocalTime.of(16,30,00), "KPHB"));

        //addAll
        movieTickets1.addAll(movieTickets);
        movieTickets.addAll(movieTickets1);
        System.out.println(movieTickets1);
        System.out.println(movieTickets1.size());


        //contains
        boolean check=movieTickets1.contains(movieTickets.getFirst());
        System.out.println("king in movieTickets1 list: "+check);

        //containsAll
        boolean check1=movieTickets.containsAll(movieTickets1);
        System.out.println("all elements in movieTickets1 list: "+check1);


        //remove
        System.out.println("Before the single removal size of movieTickets: "+movieTickets.size());
        movieTickets.remove(movieTickets.get(0));
        //System.out.println("ater single remove:"+movieTickets);
        System.out.println("size after single remove:"+movieTickets.size());

        //removeAll
        System.out.println("size of movieTickets1 before remove all: "+movieTickets1.size());
        movieTickets.removeAll(movieTickets1);
        System.out.println("After removeAll size of movieTickets1: "+movieTickets.size());

        //isEmpty
        boolean check2=movieTickets.isEmpty();
        System.out.println("is movieTickets empty: "+check2);

        boolean check3=movieTickets1.isEmpty();
        System.out.println("is movieTickets1 empty: "+check3);



        //add at specific index
        movieTickets.add(0,new MovieTicketDto("Thrones",10,100.0,LocalTime.of(12,34,21),"Madiwala"));
        System.out.println("movieTicket dto status after add(index,dto):\n"+movieTickets);
        System.out.println("size after add(index,dto):"+movieTickets.size());
    }
}
