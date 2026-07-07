package com.xworkz.streamapi.filter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WarDTO implements Serializable
{
    private String warName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private List<String> countriesInvolved;
    private int casualties;
    private String outcome;
    private int durationDays;
    private String commander;
    private String reason;
}
