package com.xworkz.conditions_solver.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SpaceProbeDto implements Serializable {
    private String probeId;
    private String missionName;
    private String targetCelestialBody;
    private String manufacturer;
    private double launchMass;
    private LocalDateTime launchDate;
    private LocalDateTime arrivalDate;
    private String propulsionType;
    private double powerOutput;
    private String communicationFrequency;
    private double distanceFromEarth;
    private double orbitalVelocity;
    private String primaryInstrument;
    private String secondaryInstrument;
    private int missionDurationDays;
    private boolean isActive;
    private String status;
    private double fuelRemaining;
    private String trajectoryPath;
}
