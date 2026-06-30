package com.xworkz.conditions_solver.dto;

import lombok.*;

import java.time.LocalTime;
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MovieTicketDto {

    private String movieName;
    private int ticketCount;
    private double ticketPrice;
    private LocalTime showTime;
    private String cinemaLocation;
}
