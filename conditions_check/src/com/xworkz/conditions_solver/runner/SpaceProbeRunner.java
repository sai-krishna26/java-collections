package com.xworkz.conditions_solver.runner;

import com.xworkz.conditions_solver.dto.SpaceProbeDto;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.LinkedList;

public class SpaceProbeRunner {
    public static void main(String[] args) {
        LinkedList<SpaceProbeDto> probes = new LinkedList<>();

        SpaceProbeDto p1 = new SpaceProbeDto("P001", "Mission1", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p1);
        SpaceProbeDto p2 = new SpaceProbeDto("P002", "Mission2", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p2);
        SpaceProbeDto p3 = new SpaceProbeDto("P003", "Mission3", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p3);
        SpaceProbeDto p4 = new SpaceProbeDto("P004", "Mission4", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p4);
        SpaceProbeDto p5 = new SpaceProbeDto("P005", "Mission5", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p5);
        SpaceProbeDto p6 = new SpaceProbeDto("P006", "Mission6", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p6);
        SpaceProbeDto p7 = new SpaceProbeDto("P007", "Mission7", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p7);
        SpaceProbeDto p8 = new SpaceProbeDto("P008", "Mission8", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p8);
        SpaceProbeDto p9 = new SpaceProbeDto("P009", "Mission9", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p9);
        SpaceProbeDto p10 = new SpaceProbeDto("P010", "Mission10", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p10);
        SpaceProbeDto p11 = new SpaceProbeDto("P011", "Mission11", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p11);
        SpaceProbeDto p12 = new SpaceProbeDto("P012", "Mission12", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p12);
        SpaceProbeDto p13 = new SpaceProbeDto("P013", "Mission13", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p13);
        SpaceProbeDto p14 = new SpaceProbeDto("P014", "Mission14", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p14);
        SpaceProbeDto p15 = new SpaceProbeDto("P015", "Mission15", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p15);
        SpaceProbeDto p16 = new SpaceProbeDto("P016", "Mission16", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p16);
        SpaceProbeDto p17 = new SpaceProbeDto("P017", "Mission17", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p17);
        SpaceProbeDto p18 = new SpaceProbeDto("P018", "Mission18", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p18);
        SpaceProbeDto p19 = new SpaceProbeDto("P019", "Mission19", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p19);
        SpaceProbeDto p20 = new SpaceProbeDto("P020", "Mission20", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p20);
        SpaceProbeDto p21 = new SpaceProbeDto("P021", "Mission21", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p21);
        SpaceProbeDto p22 = new SpaceProbeDto("P022", "Mission22", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p22);
        SpaceProbeDto p23 = new SpaceProbeDto("P023", "Mission23", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p23);
        SpaceProbeDto p24 = new SpaceProbeDto("P024", "Mission24", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p24);
        SpaceProbeDto p25 = new SpaceProbeDto("P025", "Mission25", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p25);
        SpaceProbeDto p26 = new SpaceProbeDto("P026", "Mission26", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p26);
        SpaceProbeDto p27 = new SpaceProbeDto("P027", "Mission27", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p27);
        SpaceProbeDto p28 = new SpaceProbeDto("P028", "Mission28", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p28);
        SpaceProbeDto p29 = new SpaceProbeDto("P029", "Mission29", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p29);
        SpaceProbeDto p30 = new SpaceProbeDto("P030", "Mission30", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p30);
        SpaceProbeDto p31 = new SpaceProbeDto("P031", "Mission31", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p31);
        SpaceProbeDto p32 = new SpaceProbeDto("P032", "Mission32", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p32);
        SpaceProbeDto p33 = new SpaceProbeDto("P033", "Mission33", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p33);
        SpaceProbeDto p34 = new SpaceProbeDto("P034", "Mission34", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p34);
        SpaceProbeDto p35 = new SpaceProbeDto("P035", "Mission35", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p35);
        SpaceProbeDto p36 = new SpaceProbeDto("P036", "Mission36", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p36);
        SpaceProbeDto p37 = new SpaceProbeDto("P037", "Mission37", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p37);
        SpaceProbeDto p38 = new SpaceProbeDto("P038", "Mission38", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p38);
        SpaceProbeDto p39 = new SpaceProbeDto("P039", "Mission39", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p39);
        SpaceProbeDto p40 = new SpaceProbeDto("P040", "Mission40", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p40);
        SpaceProbeDto p41 = new SpaceProbeDto("P041", "Mission41", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p41);
        SpaceProbeDto p42 = new SpaceProbeDto("P042", "Mission42", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p42);
        SpaceProbeDto p43 = new SpaceProbeDto("P043", "Mission43", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p43);
        SpaceProbeDto p44 = new SpaceProbeDto("P044", "Mission44", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p44);
        SpaceProbeDto p45 = new SpaceProbeDto("P045", "Mission45", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p45);
        SpaceProbeDto p46 = new SpaceProbeDto("P046", "Mission46", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p46);
        SpaceProbeDto p47 = new SpaceProbeDto("P047", "Mission47", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p47);
        SpaceProbeDto p48 = new SpaceProbeDto("P048", "Mission48", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p48);
        SpaceProbeDto p49 = new SpaceProbeDto("P049", "Mission49", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p49);
        SpaceProbeDto p50 = new SpaceProbeDto("P050", "Mission50", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p50);
        SpaceProbeDto p51 = new SpaceProbeDto("P051", "Mission51", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p51);
        SpaceProbeDto p52 = new SpaceProbeDto("P052", "Mission52", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p52);
        SpaceProbeDto p53 = new SpaceProbeDto("P053", "Mission53", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p53);
        SpaceProbeDto p54 = new SpaceProbeDto("P054", "Mission54", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p54);
        SpaceProbeDto p55 = new SpaceProbeDto("P055", "Mission55", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p55);
        SpaceProbeDto p56 = new SpaceProbeDto("P056", "Mission56", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p56);
        SpaceProbeDto p57 = new SpaceProbeDto("P057", "Mission57", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p57);
        SpaceProbeDto p58 = new SpaceProbeDto("P058", "Mission58", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p58);
        SpaceProbeDto p59 = new SpaceProbeDto("P059", "Mission59", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p59);
        SpaceProbeDto p60 = new SpaceProbeDto("P060", "Mission60", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p60);
        SpaceProbeDto p61 = new SpaceProbeDto("P061", "Mission61", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p61);
        SpaceProbeDto p62 = new SpaceProbeDto("P062", "Mission62", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p62);
        SpaceProbeDto p63 = new SpaceProbeDto("P063", "Mission63", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p63);
        SpaceProbeDto p64 = new SpaceProbeDto("P064", "Mission64", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p64);
        SpaceProbeDto p65 = new SpaceProbeDto("P065", "Mission65", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p65);
        SpaceProbeDto p66 = new SpaceProbeDto("P066", "Mission66", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p66);
        SpaceProbeDto p67 = new SpaceProbeDto("P067", "Mission67", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p67);
        SpaceProbeDto p68 = new SpaceProbeDto("P068", "Mission68", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p68);
        SpaceProbeDto p69 = new SpaceProbeDto("P069", "Mission69", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p69);
        SpaceProbeDto p70 = new SpaceProbeDto("P070", "Mission70", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p70);
        SpaceProbeDto p71 = new SpaceProbeDto("P071", "Mission71", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p71);
        SpaceProbeDto p72 = new SpaceProbeDto("P072", "Mission72", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p72);
        SpaceProbeDto p73 = new SpaceProbeDto("P073", "Mission73", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p73);
        SpaceProbeDto p74 = new SpaceProbeDto("P074", "Mission74", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p74);
        SpaceProbeDto p75 = new SpaceProbeDto("P075", "Mission75", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p75);
        SpaceProbeDto p76 = new SpaceProbeDto("P076", "Mission76", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p76);
        SpaceProbeDto p77 = new SpaceProbeDto("P077", "Mission77", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p77);
        SpaceProbeDto p78 = new SpaceProbeDto("P078", "Mission78", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p78);
        SpaceProbeDto p79 = new SpaceProbeDto("P079", "Mission79", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p79);
        SpaceProbeDto p80 = new SpaceProbeDto("P080", "Mission80", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p80);
        SpaceProbeDto p81 = new SpaceProbeDto("P081", "Mission81", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p81);
        SpaceProbeDto p82 = new SpaceProbeDto("P082", "Mission82", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p82);
        SpaceProbeDto p83 = new SpaceProbeDto("P083", "Mission83", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p83);
        SpaceProbeDto p84 = new SpaceProbeDto("P084", "Mission84", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p84);
        SpaceProbeDto p85 = new SpaceProbeDto("P085", "Mission85", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p85);
        SpaceProbeDto p86 = new SpaceProbeDto("P086", "Mission86", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p86);
        SpaceProbeDto p87 = new SpaceProbeDto("P087", "Mission87", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p87);
        SpaceProbeDto p88 = new SpaceProbeDto("P088", "Mission88", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p88);
        SpaceProbeDto p89 = new SpaceProbeDto("P089", "Mission89", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p89);
        SpaceProbeDto p90 = new SpaceProbeDto("P090", "Mission90", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p90);
        SpaceProbeDto p91 = new SpaceProbeDto("P091", "Mission91", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p91);
        SpaceProbeDto p92 = new SpaceProbeDto("P092", "Mission92", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p92);
        SpaceProbeDto p93 = new SpaceProbeDto("P093", "Mission93", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p93);
        SpaceProbeDto p94 = new SpaceProbeDto("P094", "Mission94", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p94);
        SpaceProbeDto p95 = new SpaceProbeDto("P095", "Mission95", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p95);
        SpaceProbeDto p96 = new SpaceProbeDto("P096", "Mission96", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p96);
        SpaceProbeDto p97 = new SpaceProbeDto("P097", "Mission97", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p97);
        SpaceProbeDto p98 = new SpaceProbeDto("P098", "Mission98", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p98);
        SpaceProbeDto p99 = new SpaceProbeDto("P099", "Mission99", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p99);
        SpaceProbeDto p100 = new SpaceProbeDto("P100", "Mission100", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p100);
        SpaceProbeDto p101 = new SpaceProbeDto("P101", "Mission101", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p101);
        SpaceProbeDto p102 = new SpaceProbeDto("P102", "Mission102", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p102);
        SpaceProbeDto p103 = new SpaceProbeDto("P103", "Mission103", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p103);
        SpaceProbeDto p104 = new SpaceProbeDto("P104", "Mission104", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p104);
        SpaceProbeDto p105 = new SpaceProbeDto("P105", "Mission105", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p105);
        SpaceProbeDto p106 = new SpaceProbeDto("P106", "Mission106", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p106);
        SpaceProbeDto p107 = new SpaceProbeDto("P107", "Mission107", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p107);
        SpaceProbeDto p108 = new SpaceProbeDto("P108", "Mission108", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p108);
        SpaceProbeDto p109 = new SpaceProbeDto("P109", "Mission109", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p109);
        SpaceProbeDto p110 = new SpaceProbeDto("P110", "Mission110", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p110);
        SpaceProbeDto p111 = new SpaceProbeDto("P111", "Mission111", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p111);
        SpaceProbeDto p112 = new SpaceProbeDto("P112", "Mission112", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p112);
        SpaceProbeDto p113 = new SpaceProbeDto("P113", "Mission113", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p113);
        SpaceProbeDto p114 = new SpaceProbeDto("P114", "Mission114", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p114);
        SpaceProbeDto p115 = new SpaceProbeDto("P115", "Mission115", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p115);
        SpaceProbeDto p116 = new SpaceProbeDto("P116", "Mission116", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p116);
        SpaceProbeDto p117 = new SpaceProbeDto("P117", "Mission117", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p117);
        SpaceProbeDto p118 = new SpaceProbeDto("P118", "Mission118", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p118);
        SpaceProbeDto p119 = new SpaceProbeDto("P119", "Mission119", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p119);
        SpaceProbeDto p120 = new SpaceProbeDto("P120", "Mission120", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p120);
        SpaceProbeDto p121 = new SpaceProbeDto("P121", "Mission121", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p121);
        SpaceProbeDto p122 = new SpaceProbeDto("P122", "Mission122", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p122);
        SpaceProbeDto p123 = new SpaceProbeDto("P123", "Mission123", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p123);
        SpaceProbeDto p124 = new SpaceProbeDto("P124", "Mission124", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p124);
        SpaceProbeDto p125 = new SpaceProbeDto("P125", "Mission125", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p125);
        SpaceProbeDto p126 = new SpaceProbeDto("P126", "Mission126", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p126);
        SpaceProbeDto p127 = new SpaceProbeDto("P127", "Mission127", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p127);
        SpaceProbeDto p128 = new SpaceProbeDto("P128", "Mission128", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p128);
        SpaceProbeDto p129 = new SpaceProbeDto("P129", "Mission129", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p129);
        SpaceProbeDto p130 = new SpaceProbeDto("P130", "Mission130", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p130);
        SpaceProbeDto p131 = new SpaceProbeDto("P131", "Mission131", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p131);
        SpaceProbeDto p132 = new SpaceProbeDto("P132", "Mission132", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p132);
        SpaceProbeDto p133 = new SpaceProbeDto("P133", "Mission133", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p133);
        SpaceProbeDto p134 = new SpaceProbeDto("P134", "Mission134", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p134);
        SpaceProbeDto p135 = new SpaceProbeDto("P135", "Mission135", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p135);
        SpaceProbeDto p136 = new SpaceProbeDto("P136", "Mission136", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p136);
        SpaceProbeDto p137 = new SpaceProbeDto("P137", "Mission137", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p137);
        SpaceProbeDto p138 = new SpaceProbeDto("P138", "Mission138", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p138);
        SpaceProbeDto p139 = new SpaceProbeDto("P139", "Mission139", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p139);
        SpaceProbeDto p140 = new SpaceProbeDto("P140", "Mission140", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p140);
        SpaceProbeDto p141 = new SpaceProbeDto("P141", "Mission141", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p141);
        SpaceProbeDto p142 = new SpaceProbeDto("P142", "Mission142", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p142);
        SpaceProbeDto p143 = new SpaceProbeDto("P143", "Mission143", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p143);
        SpaceProbeDto p144 = new SpaceProbeDto("P144", "Mission144", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p144);
        SpaceProbeDto p145 = new SpaceProbeDto("P145", "Mission145", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p145);
        SpaceProbeDto p146 = new SpaceProbeDto("P146", "Mission146", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p146);
        SpaceProbeDto p147 = new SpaceProbeDto("P147", "Mission147", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p147);
        SpaceProbeDto p148 = new SpaceProbeDto("P148", "Mission148", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p148);
        SpaceProbeDto p149 = new SpaceProbeDto("P149", "Mission149", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p149);
        SpaceProbeDto p150 = new SpaceProbeDto("P150", "Mission150", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p150);
        SpaceProbeDto p151 = new SpaceProbeDto("P151", "Mission151", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p151);
        SpaceProbeDto p152 = new SpaceProbeDto("P152", "Mission152", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p152);
        SpaceProbeDto p153 = new SpaceProbeDto("P153", "Mission153", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p153);
        SpaceProbeDto p154 = new SpaceProbeDto("P154", "Mission154", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p154);
        SpaceProbeDto p155 = new SpaceProbeDto("P155", "Mission155", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p155);
        SpaceProbeDto p156 = new SpaceProbeDto("P156", "Mission156", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p156);
        SpaceProbeDto p157 = new SpaceProbeDto("P157", "Mission157", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p157);
        SpaceProbeDto p158 = new SpaceProbeDto("P158", "Mission158", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p158);
        SpaceProbeDto p159 = new SpaceProbeDto("P159", "Mission159", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p159);
        SpaceProbeDto p160 = new SpaceProbeDto("P160", "Mission160", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p160);
        SpaceProbeDto p161 = new SpaceProbeDto("P161", "Mission161", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p161);
        SpaceProbeDto p162 = new SpaceProbeDto("P162", "Mission162", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p162);
        SpaceProbeDto p163 = new SpaceProbeDto("P163", "Mission163", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p163);
        SpaceProbeDto p164 = new SpaceProbeDto("P164", "Mission164", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p164);
        SpaceProbeDto p165 = new SpaceProbeDto("P165", "Mission165", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p165);
        SpaceProbeDto p166 = new SpaceProbeDto("P166", "Mission166", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p166);
        SpaceProbeDto p167 = new SpaceProbeDto("P167", "Mission167", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p167);
        SpaceProbeDto p168 = new SpaceProbeDto("P168", "Mission168", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p168);
        SpaceProbeDto p169 = new SpaceProbeDto("P169", "Mission169", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p169);
        SpaceProbeDto p170 = new SpaceProbeDto("P170", "Mission170", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p170);
        SpaceProbeDto p171 = new SpaceProbeDto("P171", "Mission171", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p171);
        SpaceProbeDto p172 = new SpaceProbeDto("P172", "Mission172", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p172);
        SpaceProbeDto p173 = new SpaceProbeDto("P173", "Mission173", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p173);
        SpaceProbeDto p174 = new SpaceProbeDto("P174", "Mission174", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p174);
        SpaceProbeDto p175 = new SpaceProbeDto("P175", "Mission175", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p175);
        SpaceProbeDto p176 = new SpaceProbeDto("P176", "Mission176", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p176);
        SpaceProbeDto p177 = new SpaceProbeDto("P177", "Mission177", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p177);
        SpaceProbeDto p178 = new SpaceProbeDto("P178", "Mission178", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p178);
        SpaceProbeDto p179 = new SpaceProbeDto("P179", "Mission179", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p179);
        SpaceProbeDto p180 = new SpaceProbeDto("P180", "Mission180", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p180);
        SpaceProbeDto p181 = new SpaceProbeDto("P181", "Mission181", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p181);
        SpaceProbeDto p182 = new SpaceProbeDto("P182", "Mission182", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p182);
        SpaceProbeDto p183 = new SpaceProbeDto("P183", "Mission183", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p183);
        SpaceProbeDto p184 = new SpaceProbeDto("P184", "Mission184", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p184);
        SpaceProbeDto p185 = new SpaceProbeDto("P185", "Mission185", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p185);
        SpaceProbeDto p186 = new SpaceProbeDto("P186", "Mission186", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p186);
        SpaceProbeDto p187 = new SpaceProbeDto("P187", "Mission187", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p187);
        SpaceProbeDto p188 = new SpaceProbeDto("P188", "Mission188", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p188);
        SpaceProbeDto p189 = new SpaceProbeDto("P189", "Mission189", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p189);
        SpaceProbeDto p190 = new SpaceProbeDto("P190", "Mission190", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p190);
        SpaceProbeDto p191 = new SpaceProbeDto("P191", "Mission191", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p191);
        SpaceProbeDto p192 = new SpaceProbeDto("P192", "Mission192", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p192);
        SpaceProbeDto p193 = new SpaceProbeDto("P193", "Mission193", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p193);
        SpaceProbeDto p194 = new SpaceProbeDto("P194", "Mission194", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p194);
        SpaceProbeDto p195 = new SpaceProbeDto("P195", "Mission195", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p195);
        SpaceProbeDto p196 = new SpaceProbeDto("P196", "Mission196", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p196);
        SpaceProbeDto p197 = new SpaceProbeDto("P197", "Mission197", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p197);
        SpaceProbeDto p198 = new SpaceProbeDto("P198", "Mission198", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p198);
        SpaceProbeDto p199 = new SpaceProbeDto("P199", "Mission199", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p199);
        SpaceProbeDto p200 = new SpaceProbeDto("P200", "Mission200", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p200);
        SpaceProbeDto p201 = new SpaceProbeDto("P201", "Mission201", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p201);
        SpaceProbeDto p202 = new SpaceProbeDto("P202", "Mission202", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p202);
        SpaceProbeDto p203 = new SpaceProbeDto("P203", "Mission203", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p203);
        SpaceProbeDto p204 = new SpaceProbeDto("P204", "Mission204", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p204);
        SpaceProbeDto p205 = new SpaceProbeDto("P205", "Mission205", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p205);
        SpaceProbeDto p206 = new SpaceProbeDto("P206", "Mission206", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p206);
        SpaceProbeDto p207 = new SpaceProbeDto("P207", "Mission207", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p207);
        SpaceProbeDto p208 = new SpaceProbeDto("P208", "Mission208", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p208);
        SpaceProbeDto p209 = new SpaceProbeDto("P209", "Mission209", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p209);
        SpaceProbeDto p210 = new SpaceProbeDto("P210", "Mission210", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p210);
        SpaceProbeDto p211 = new SpaceProbeDto("P211", "Mission211", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p211);
        SpaceProbeDto p212 = new SpaceProbeDto("P212", "Mission212", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p212);
        SpaceProbeDto p213 = new SpaceProbeDto("P213", "Mission213", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p213);
        SpaceProbeDto p214 = new SpaceProbeDto("P214", "Mission214", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p214);
        SpaceProbeDto p215 = new SpaceProbeDto("P215", "Mission215", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p215);
        SpaceProbeDto p216 = new SpaceProbeDto("P216", "Mission216", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p216);
        SpaceProbeDto p217 = new SpaceProbeDto("P217", "Mission217", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p217);
        SpaceProbeDto p218 = new SpaceProbeDto("P218", "Mission218", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p218);
        SpaceProbeDto p219 = new SpaceProbeDto("P219", "Mission219", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p219);
        SpaceProbeDto p220 = new SpaceProbeDto("P220", "Mission220", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p220);
        SpaceProbeDto p221 = new SpaceProbeDto("P221", "Mission221", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p221);
        SpaceProbeDto p222 = new SpaceProbeDto("P222", "Mission222", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p222);
        SpaceProbeDto p223 = new SpaceProbeDto("P223", "Mission223", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p223);
        SpaceProbeDto p224 = new SpaceProbeDto("P224", "Mission224", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p224);
        SpaceProbeDto p225 = new SpaceProbeDto("P225", "Mission225", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p225);
        SpaceProbeDto p226 = new SpaceProbeDto("P226", "Mission226", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p226);
        SpaceProbeDto p227 = new SpaceProbeDto("P227", "Mission227", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p227);
        SpaceProbeDto p228 = new SpaceProbeDto("P228", "Mission228", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p228);
        SpaceProbeDto p229 = new SpaceProbeDto("P229", "Mission229", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p229);
        SpaceProbeDto p230 = new SpaceProbeDto("P230", "Mission230", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p230);
        SpaceProbeDto p231 = new SpaceProbeDto("P231", "Mission231", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p231);
        SpaceProbeDto p232 = new SpaceProbeDto("P232", "Mission232", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p232);
        SpaceProbeDto p233 = new SpaceProbeDto("P233", "Mission233", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p233);
        SpaceProbeDto p234 = new SpaceProbeDto("P234", "Mission234", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p234);
        SpaceProbeDto p235 = new SpaceProbeDto("P235", "Mission235", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p235);
        SpaceProbeDto p236 = new SpaceProbeDto("P236", "Mission236", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p236);
        SpaceProbeDto p237 = new SpaceProbeDto("P237", "Mission237", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p237);
        SpaceProbeDto p238 = new SpaceProbeDto("P238", "Mission238", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p238);
        SpaceProbeDto p239 = new SpaceProbeDto("P239", "Mission239", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p239);
        SpaceProbeDto p240 = new SpaceProbeDto("P240", "Mission240", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p240);
        SpaceProbeDto p241 = new SpaceProbeDto("P241", "Mission241", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p241);
        SpaceProbeDto p242 = new SpaceProbeDto("P242", "Mission242", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p242);
        SpaceProbeDto p243 = new SpaceProbeDto("P243", "Mission243", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p243);
        SpaceProbeDto p244 = new SpaceProbeDto("P244", "Mission244", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p244);
        SpaceProbeDto p245 = new SpaceProbeDto("P245", "Mission245", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p245);
        SpaceProbeDto p246 = new SpaceProbeDto("P246", "Mission246", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p246);
        SpaceProbeDto p247 = new SpaceProbeDto("P247", "Mission247", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p247);
        SpaceProbeDto p248 = new SpaceProbeDto("P248", "Mission248", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p248);
        SpaceProbeDto p249 = new SpaceProbeDto("P249", "Mission249", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p249);
        SpaceProbeDto p250 = new SpaceProbeDto("P250", "Mission250", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p250);
        SpaceProbeDto p251 = new SpaceProbeDto("P251", "Mission251", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p251);
        SpaceProbeDto p252 = new SpaceProbeDto("P252", "Mission252", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p252);
        SpaceProbeDto p253 = new SpaceProbeDto("P253", "Mission253", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p253);
        SpaceProbeDto p254 = new SpaceProbeDto("P254", "Mission254", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p254);
        SpaceProbeDto p255 = new SpaceProbeDto("P255", "Mission255", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p255);
        SpaceProbeDto p256 = new SpaceProbeDto("P256", "Mission256", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p256);
        SpaceProbeDto p257 = new SpaceProbeDto("P257", "Mission257", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p257);
        SpaceProbeDto p258 = new SpaceProbeDto("P258", "Mission258", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p258);
        SpaceProbeDto p259 = new SpaceProbeDto("P259", "Mission259", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p259);
        SpaceProbeDto p260 = new SpaceProbeDto("P260", "Mission260", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p260);
        SpaceProbeDto p261 = new SpaceProbeDto("P261", "Mission261", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p261);
        SpaceProbeDto p262 = new SpaceProbeDto("P262", "Mission262", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p262);
        SpaceProbeDto p263 = new SpaceProbeDto("P263", "Mission263", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p263);
        SpaceProbeDto p264 = new SpaceProbeDto("P264", "Mission264", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p264);
        SpaceProbeDto p265 = new SpaceProbeDto("P265", "Mission265", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p265);
        SpaceProbeDto p266 = new SpaceProbeDto("P266", "Mission266", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p266);
        SpaceProbeDto p267 = new SpaceProbeDto("P267", "Mission267", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p267);
        SpaceProbeDto p268 = new SpaceProbeDto("P268", "Mission268", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p268);
        SpaceProbeDto p269 = new SpaceProbeDto("P269", "Mission269", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p269);
        SpaceProbeDto p270 = new SpaceProbeDto("P270", "Mission270", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p270);
        SpaceProbeDto p271 = new SpaceProbeDto("P271", "Mission271", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p271);
        SpaceProbeDto p272 = new SpaceProbeDto("P272", "Mission272", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p272);
        SpaceProbeDto p273 = new SpaceProbeDto("P273", "Mission273", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p273);
        SpaceProbeDto p274 = new SpaceProbeDto("P274", "Mission274", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p274);
        SpaceProbeDto p275 = new SpaceProbeDto("P275", "Mission275", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p275);
        SpaceProbeDto p276 = new SpaceProbeDto("P276", "Mission276", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p276);
        SpaceProbeDto p277 = new SpaceProbeDto("P277", "Mission277", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p277);
        SpaceProbeDto p278 = new SpaceProbeDto("P278", "Mission278", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p278);
        SpaceProbeDto p279 = new SpaceProbeDto("P279", "Mission279", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p279);
        SpaceProbeDto p280 = new SpaceProbeDto("P280", "Mission280", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p280);
        SpaceProbeDto p281 = new SpaceProbeDto("P281", "Mission281", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p281);
        SpaceProbeDto p282 = new SpaceProbeDto("P282", "Mission282", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p282);
        SpaceProbeDto p283 = new SpaceProbeDto("P283", "Mission283", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p283);
        SpaceProbeDto p284 = new SpaceProbeDto("P284", "Mission284", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p284);
        SpaceProbeDto p285 = new SpaceProbeDto("P285", "Mission285", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p285);
        SpaceProbeDto p286 = new SpaceProbeDto("P286", "Mission286", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p286);
        SpaceProbeDto p287 = new SpaceProbeDto("P287", "Mission287", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p287);
        SpaceProbeDto p288 = new SpaceProbeDto("P288", "Mission288", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p288);
        SpaceProbeDto p289 = new SpaceProbeDto("P289", "Mission289", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p289);
        SpaceProbeDto p290 = new SpaceProbeDto("P290", "Mission290", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p290);
        SpaceProbeDto p291 = new SpaceProbeDto("P291", "Mission291", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p291);
        SpaceProbeDto p292 = new SpaceProbeDto("P292", "Mission292", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p292);
        SpaceProbeDto p293 = new SpaceProbeDto("P293", "Mission293", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p293);
        SpaceProbeDto p294 = new SpaceProbeDto("P294", "Mission294", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p294);
        SpaceProbeDto p295 = new SpaceProbeDto("P295", "Mission295", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p295);
        SpaceProbeDto p296 = new SpaceProbeDto("P296", "Mission296", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p296);
        SpaceProbeDto p297 = new SpaceProbeDto("P297", "Mission297", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p297);
        SpaceProbeDto p298 = new SpaceProbeDto("P298", "Mission298", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p298);
        SpaceProbeDto p299 = new SpaceProbeDto("P299", "Mission299", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p299);
        SpaceProbeDto p300 = new SpaceProbeDto("P300", "Mission300", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p300);
        SpaceProbeDto p301 = new SpaceProbeDto("P301", "Mission301", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p301);
        SpaceProbeDto p302 = new SpaceProbeDto("P302", "Mission302", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p302);
        SpaceProbeDto p303 = new SpaceProbeDto("P303", "Mission303", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p303);
        SpaceProbeDto p304 = new SpaceProbeDto("P304", "Mission304", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p304);
        SpaceProbeDto p305 = new SpaceProbeDto("P305", "Mission305", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p305);
        SpaceProbeDto p306 = new SpaceProbeDto("P306", "Mission306", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p306);
        SpaceProbeDto p307 = new SpaceProbeDto("P307", "Mission307", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p307);
        SpaceProbeDto p308 = new SpaceProbeDto("P308", "Mission308", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p308);
        SpaceProbeDto p309 = new SpaceProbeDto("P309", "Mission309", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p309);
        SpaceProbeDto p310 = new SpaceProbeDto("P310", "Mission310", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p310);
        SpaceProbeDto p311 = new SpaceProbeDto("P311", "Mission311", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p311);
        SpaceProbeDto p312 = new SpaceProbeDto("P312", "Mission312", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p312);
        SpaceProbeDto p313 = new SpaceProbeDto("P313", "Mission313", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p313);
        SpaceProbeDto p314 = new SpaceProbeDto("P314", "Mission314", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p314);
        SpaceProbeDto p315 = new SpaceProbeDto("P315", "Mission315", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p315);
        SpaceProbeDto p316 = new SpaceProbeDto("P316", "Mission316", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p316);
        SpaceProbeDto p317 = new SpaceProbeDto("P317", "Mission317", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p317);
        SpaceProbeDto p318 = new SpaceProbeDto("P318", "Mission318", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p318);
        SpaceProbeDto p319 = new SpaceProbeDto("P319", "Mission319", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p319);
        SpaceProbeDto p320 = new SpaceProbeDto("P320", "Mission320", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p320);
        SpaceProbeDto p321 = new SpaceProbeDto("P321", "Mission321", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p321);
        SpaceProbeDto p322 = new SpaceProbeDto("P322", "Mission322", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p322);
        SpaceProbeDto p323 = new SpaceProbeDto("P323", "Mission323", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p323);
        SpaceProbeDto p324 = new SpaceProbeDto("P324", "Mission324", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p324);
        SpaceProbeDto p325 = new SpaceProbeDto("P325", "Mission325", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p325);
        SpaceProbeDto p326 = new SpaceProbeDto("P326", "Mission326", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p326);
        SpaceProbeDto p327 = new SpaceProbeDto("P327", "Mission327", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p327);
        SpaceProbeDto p328 = new SpaceProbeDto("P328", "Mission328", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p328);
        SpaceProbeDto p329 = new SpaceProbeDto("P329", "Mission329", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p329);
        SpaceProbeDto p330 = new SpaceProbeDto("P330", "Mission330", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p330);
        SpaceProbeDto p331 = new SpaceProbeDto("P331", "Mission331", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p331);
        SpaceProbeDto p332 = new SpaceProbeDto("P332", "Mission332", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p332);
        SpaceProbeDto p333 = new SpaceProbeDto("P333", "Mission333", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p333);
        SpaceProbeDto p334 = new SpaceProbeDto("P334", "Mission334", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p334);
        SpaceProbeDto p335 = new SpaceProbeDto("P335", "Mission335", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p335);
        SpaceProbeDto p336 = new SpaceProbeDto("P336", "Mission336", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p336);
        SpaceProbeDto p337 = new SpaceProbeDto("P337", "Mission337", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p337);
        SpaceProbeDto p338 = new SpaceProbeDto("P338", "Mission338", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p338);
        SpaceProbeDto p339 = new SpaceProbeDto("P339", "Mission339", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p339);
        SpaceProbeDto p340 = new SpaceProbeDto("P340", "Mission340", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p340);
        SpaceProbeDto p341 = new SpaceProbeDto("P341", "Mission341", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p341);
        SpaceProbeDto p342 = new SpaceProbeDto("P342", "Mission342", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p342);
        SpaceProbeDto p343 = new SpaceProbeDto("P343", "Mission343", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p343);
        SpaceProbeDto p344 = new SpaceProbeDto("P344", "Mission344", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p344);
        SpaceProbeDto p345 = new SpaceProbeDto("P345", "Mission345", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p345);
        SpaceProbeDto p346 = new SpaceProbeDto("P346", "Mission346", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p346);
        SpaceProbeDto p347 = new SpaceProbeDto("P347", "Mission347", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p347);
        SpaceProbeDto p348 = new SpaceProbeDto("P348", "Mission348", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p348);
        SpaceProbeDto p349 = new SpaceProbeDto("P349", "Mission349", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p349);
        SpaceProbeDto p350 = new SpaceProbeDto("P350", "Mission350", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p350);
        SpaceProbeDto p351 = new SpaceProbeDto("P351", "Mission351", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p351);
        SpaceProbeDto p352 = new SpaceProbeDto("P352", "Mission352", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p352);
        SpaceProbeDto p353 = new SpaceProbeDto("P353", "Mission353", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p353);
        SpaceProbeDto p354 = new SpaceProbeDto("P354", "Mission354", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p354);
        SpaceProbeDto p355 = new SpaceProbeDto("P355", "Mission355", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p355);
        SpaceProbeDto p356 = new SpaceProbeDto("P356", "Mission356", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p356);
        SpaceProbeDto p357 = new SpaceProbeDto("P357", "Mission357", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p357);
        SpaceProbeDto p358 = new SpaceProbeDto("P358", "Mission358", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p358);
        SpaceProbeDto p359 = new SpaceProbeDto("P359", "Mission359", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p359);
        SpaceProbeDto p360 = new SpaceProbeDto("P360", "Mission360", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p360);
        SpaceProbeDto p361 = new SpaceProbeDto("P361", "Mission361", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p361);
        SpaceProbeDto p362 = new SpaceProbeDto("P362", "Mission362", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p362);
        SpaceProbeDto p363 = new SpaceProbeDto("P363", "Mission363", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p363);
        SpaceProbeDto p364 = new SpaceProbeDto("P364", "Mission364", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p364);
        SpaceProbeDto p365 = new SpaceProbeDto("P365", "Mission365", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p365);
        SpaceProbeDto p366 = new SpaceProbeDto("P366", "Mission366", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p366);
        SpaceProbeDto p367 = new SpaceProbeDto("P367", "Mission367", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p367);
        SpaceProbeDto p368 = new SpaceProbeDto("P368", "Mission368", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p368);
        SpaceProbeDto p369 = new SpaceProbeDto("P369", "Mission369", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p369);
        SpaceProbeDto p370 = new SpaceProbeDto("P370", "Mission370", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p370);
        SpaceProbeDto p371 = new SpaceProbeDto("P371", "Mission371", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p371);
        SpaceProbeDto p372 = new SpaceProbeDto("P372", "Mission372", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p372);
        SpaceProbeDto p373 = new SpaceProbeDto("P373", "Mission373", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p373);
        SpaceProbeDto p374 = new SpaceProbeDto("P374", "Mission374", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p374);
        SpaceProbeDto p375 = new SpaceProbeDto("P375", "Mission375", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p375);
        SpaceProbeDto p376 = new SpaceProbeDto("P376", "Mission376", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p376);
        SpaceProbeDto p377 = new SpaceProbeDto("P377", "Mission377", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p377);
        SpaceProbeDto p378 = new SpaceProbeDto("P378", "Mission378", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p378);
        SpaceProbeDto p379 = new SpaceProbeDto("P379", "Mission379", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p379);
        SpaceProbeDto p380 = new SpaceProbeDto("P380", "Mission380", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p380);
        SpaceProbeDto p381 = new SpaceProbeDto("P381", "Mission381", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p381);
        SpaceProbeDto p382 = new SpaceProbeDto("P382", "Mission382", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p382);
        SpaceProbeDto p383 = new SpaceProbeDto("P383", "Mission383", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p383);
        SpaceProbeDto p384 = new SpaceProbeDto("P384", "Mission384", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p384);
        SpaceProbeDto p385 = new SpaceProbeDto("P385", "Mission385", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p385);
        SpaceProbeDto p386 = new SpaceProbeDto("P386", "Mission386", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p386);
        SpaceProbeDto p387 = new SpaceProbeDto("P387", "Mission387", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p387);
        SpaceProbeDto p388 = new SpaceProbeDto("P388", "Mission388", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p388);
        SpaceProbeDto p389 = new SpaceProbeDto("P389", "Mission389", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p389);
        SpaceProbeDto p390 = new SpaceProbeDto("P390", "Mission390", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p390);
        SpaceProbeDto p391 = new SpaceProbeDto("P391", "Mission391", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p391);
        SpaceProbeDto p392 = new SpaceProbeDto("P392", "Mission392", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p392);
        SpaceProbeDto p393 = new SpaceProbeDto("P393", "Mission393", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p393);
        SpaceProbeDto p394 = new SpaceProbeDto("P394", "Mission394", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p394);
        SpaceProbeDto p395 = new SpaceProbeDto("P395", "Mission395", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p395);
        SpaceProbeDto p396 = new SpaceProbeDto("P396", "Mission396", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p396);
        SpaceProbeDto p397 = new SpaceProbeDto("P397", "Mission397", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p397);
        SpaceProbeDto p398 = new SpaceProbeDto("P398", "Mission398", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p398);
        SpaceProbeDto p399 = new SpaceProbeDto("P399", "Mission399", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p399);
        SpaceProbeDto p400 = new SpaceProbeDto("P400", "Mission400", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p400);
        SpaceProbeDto p401 = new SpaceProbeDto("P401", "Mission401", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p401);
        SpaceProbeDto p402 = new SpaceProbeDto("P402", "Mission402", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p402);
        SpaceProbeDto p403 = new SpaceProbeDto("P403", "Mission403", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p403);
        SpaceProbeDto p404 = new SpaceProbeDto("P404", "Mission404", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p404);
        SpaceProbeDto p405 = new SpaceProbeDto("P405", "Mission405", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p405);
        SpaceProbeDto p406 = new SpaceProbeDto("P406", "Mission406", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p406);
        SpaceProbeDto p407 = new SpaceProbeDto("P407", "Mission407", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p407);
        SpaceProbeDto p408 = new SpaceProbeDto("P408", "Mission408", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p408);
        SpaceProbeDto p409 = new SpaceProbeDto("P409", "Mission409", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p409);
        SpaceProbeDto p410 = new SpaceProbeDto("P410", "Mission410", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p410);
        SpaceProbeDto p411 = new SpaceProbeDto("P411", "Mission411", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p411);
        SpaceProbeDto p412 = new SpaceProbeDto("P412", "Mission412", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p412);
        SpaceProbeDto p413 = new SpaceProbeDto("P413", "Mission413", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p413);
        SpaceProbeDto p414 = new SpaceProbeDto("P414", "Mission414", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p414);
        SpaceProbeDto p415 = new SpaceProbeDto("P415", "Mission415", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p415);
        SpaceProbeDto p416 = new SpaceProbeDto("P416", "Mission416", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p416);
        SpaceProbeDto p417 = new SpaceProbeDto("P417", "Mission417", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p417);
        SpaceProbeDto p418 = new SpaceProbeDto("P418", "Mission418", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p418);
        SpaceProbeDto p419 = new SpaceProbeDto("P419", "Mission419", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p419);
        SpaceProbeDto p420 = new SpaceProbeDto("P420", "Mission420", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p420);
        SpaceProbeDto p421 = new SpaceProbeDto("P421", "Mission421", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p421);
        SpaceProbeDto p422 = new SpaceProbeDto("P422", "Mission422", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p422);
        SpaceProbeDto p423 = new SpaceProbeDto("P423", "Mission423", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p423);
        SpaceProbeDto p424 = new SpaceProbeDto("P424", "Mission424", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p424);
        SpaceProbeDto p425 = new SpaceProbeDto("P425", "Mission425", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p425);
        SpaceProbeDto p426 = new SpaceProbeDto("P426", "Mission426", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p426);
        SpaceProbeDto p427 = new SpaceProbeDto("P427", "Mission427", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p427);
        SpaceProbeDto p428 = new SpaceProbeDto("P428", "Mission428", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p428);
        SpaceProbeDto p429 = new SpaceProbeDto("P429", "Mission429", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p429);
        SpaceProbeDto p430 = new SpaceProbeDto("P430", "Mission430", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p430);
        SpaceProbeDto p431 = new SpaceProbeDto("P431", "Mission431", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p431);
        SpaceProbeDto p432 = new SpaceProbeDto("P432", "Mission432", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p432);
        SpaceProbeDto p433 = new SpaceProbeDto("P433", "Mission433", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p433);
        SpaceProbeDto p434 = new SpaceProbeDto("P434", "Mission434", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p434);
        SpaceProbeDto p435 = new SpaceProbeDto("P435", "Mission435", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p435);
        SpaceProbeDto p436 = new SpaceProbeDto("P436", "Mission436", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p436);
        SpaceProbeDto p437 = new SpaceProbeDto("P437", "Mission437", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p437);
        SpaceProbeDto p438 = new SpaceProbeDto("P438", "Mission438", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p438);
        SpaceProbeDto p439 = new SpaceProbeDto("P439", "Mission439", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p439);
        SpaceProbeDto p440 = new SpaceProbeDto("P440", "Mission440", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p440);
        SpaceProbeDto p441 = new SpaceProbeDto("P441", "Mission441", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p441);
        SpaceProbeDto p442 = new SpaceProbeDto("P442", "Mission442", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p442);
        SpaceProbeDto p443 = new SpaceProbeDto("P443", "Mission443", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p443);
        SpaceProbeDto p444 = new SpaceProbeDto("P444", "Mission444", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p444);
        SpaceProbeDto p445 = new SpaceProbeDto("P445", "Mission445", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p445);
        SpaceProbeDto p446 = new SpaceProbeDto("P446", "Mission446", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p446);
        SpaceProbeDto p447 = new SpaceProbeDto("P447", "Mission447", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p447);
        SpaceProbeDto p448 = new SpaceProbeDto("P448", "Mission448", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p448);
        SpaceProbeDto p449 = new SpaceProbeDto("P449", "Mission449", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p449);
        SpaceProbeDto p450 = new SpaceProbeDto("P450", "Mission450", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p450);
        SpaceProbeDto p451 = new SpaceProbeDto("P451", "Mission451", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p451);
        SpaceProbeDto p452 = new SpaceProbeDto("P452", "Mission452", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p452);
        SpaceProbeDto p453 = new SpaceProbeDto("P453", "Mission453", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p453);
        SpaceProbeDto p454 = new SpaceProbeDto("P454", "Mission454", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p454);
        SpaceProbeDto p455 = new SpaceProbeDto("P455", "Mission455", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p455);
        SpaceProbeDto p456 = new SpaceProbeDto("P456", "Mission456", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p456);
        SpaceProbeDto p457 = new SpaceProbeDto("P457", "Mission457", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p457);
        SpaceProbeDto p458 = new SpaceProbeDto("P458", "Mission458", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p458);
        SpaceProbeDto p459 = new SpaceProbeDto("P459", "Mission459", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p459);
        SpaceProbeDto p460 = new SpaceProbeDto("P460", "Mission460", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p460);
        SpaceProbeDto p461 = new SpaceProbeDto("P461", "Mission461", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p461);
        SpaceProbeDto p462 = new SpaceProbeDto("P462", "Mission462", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p462);
        SpaceProbeDto p463 = new SpaceProbeDto("P463", "Mission463", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p463);
        SpaceProbeDto p464 = new SpaceProbeDto("P464", "Mission464", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p464);
        SpaceProbeDto p465 = new SpaceProbeDto("P465", "Mission465", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p465);
        SpaceProbeDto p466 = new SpaceProbeDto("P466", "Mission466", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p466);
        SpaceProbeDto p467 = new SpaceProbeDto("P467", "Mission467", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p467);
        SpaceProbeDto p468 = new SpaceProbeDto("P468", "Mission468", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p468);
        SpaceProbeDto p469 = new SpaceProbeDto("P469", "Mission469", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p469);
        SpaceProbeDto p470 = new SpaceProbeDto("P470", "Mission470", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p470);
        SpaceProbeDto p471 = new SpaceProbeDto("P471", "Mission471", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p471);
        SpaceProbeDto p472 = new SpaceProbeDto("P472", "Mission472", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p472);
        SpaceProbeDto p473 = new SpaceProbeDto("P473", "Mission473", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p473);
        SpaceProbeDto p474 = new SpaceProbeDto("P474", "Mission474", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p474);
        SpaceProbeDto p475 = new SpaceProbeDto("P475", "Mission475", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p475);
        SpaceProbeDto p476 = new SpaceProbeDto("P476", "Mission476", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p476);
        SpaceProbeDto p477 = new SpaceProbeDto("P477", "Mission477", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p477);
        SpaceProbeDto p478 = new SpaceProbeDto("P478", "Mission478", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p478);
        SpaceProbeDto p479 = new SpaceProbeDto("P479", "Mission479", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p479);
        SpaceProbeDto p480 = new SpaceProbeDto("P480", "Mission480", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p480);
        SpaceProbeDto p481 = new SpaceProbeDto("P481", "Mission481", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p481);
        SpaceProbeDto p482 = new SpaceProbeDto("P482", "Mission482", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p482);
        SpaceProbeDto p483 = new SpaceProbeDto("P483", "Mission483", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p483);
        SpaceProbeDto p484 = new SpaceProbeDto("P484", "Mission484", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p484);
        SpaceProbeDto p485 = new SpaceProbeDto("P485", "Mission485", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p485);
        SpaceProbeDto p486 = new SpaceProbeDto("P486", "Mission486", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p486);
        SpaceProbeDto p487 = new SpaceProbeDto("P487", "Mission487", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p487);
        SpaceProbeDto p488 = new SpaceProbeDto("P488", "Mission488", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p488);
        SpaceProbeDto p489 = new SpaceProbeDto("P489", "Mission489", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p489);
        SpaceProbeDto p490 = new SpaceProbeDto("P490", "Mission490", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p490);
        SpaceProbeDto p491 = new SpaceProbeDto("P491", "Mission491", "Mars", "NASA", 1200, LocalDateTime.of(2018,1,1,10,0), LocalDateTime.of(2019,1,1,10,0), "Solar Electric", 1500, "X-Band", 500000, 35.5, "Camera", "Spectrometer", 600, true, "Success", 60, "Elliptical");
        probes.add(p491);
        SpaceProbeDto p492 = new SpaceProbeDto("P492", "Mission492", "Moon", "ISRO", 900, LocalDateTime.of(2021,2,1,10,0), LocalDateTime.of(2021,3,1,10,0), "Chemical", 450, "Ka-Band", 12000000, 18.2, "Radar", "", 80, false, "Failed", 5, "Circular");
        probes.add(p492);
        SpaceProbeDto p493 = new SpaceProbeDto("P493", "Mission493", "Jupiter", "ESA", 2500, LocalDateTime.of(2014,3,1,10,0), LocalDateTime.of(2018,3,1,10,0), "Ion", 5200, "S-Band", 60000000, 40.1, "Spectrometer", "Camera", 1200, true, "In Progress", 75, "Transfer Orbit");
        probes.add(p493);
        SpaceProbeDto p494 = new SpaceProbeDto("P494", "Mission494", "Pluto", "JAXA", 2200, LocalDateTime.of(2010,4,1,10,0), null, "Solar Electric", 700, "X-Band", 80000000, 27.5, "Camera", null, 300, false, "Aborted", 15, "Elliptical");
        probes.add(p494);
        SpaceProbeDto p495 = new SpaceProbeDto("P495", "Mission495", "Mars", "ESA", 1800, LocalDateTime.of(2016,5,1,10,0), LocalDateTime.of(2017,5,1,10,0), "Chemical", 1100, "X-Band", 700000, 32.0, "Spectrometer", "Radar", 700, true, "Success", 55, "Circular");
        probes.add(p495);
        SpaceProbeDto p496 = new SpaceProbeDto("P496", "Mission496", "Moon", "NASA", 2100, LocalDateTime.of(2012,6,1,10,0), LocalDateTime.of(2013,6,1,10,0), "Nuclear", 6000, "Ka-Band", 200000, 45.0, "Camera", "Magnetometer", 1500, true, "Success", 90, "Elliptical");
        probes.add(p496);
        SpaceProbeDto p497 = new SpaceProbeDto("P497", "Mission497", "Saturn", "ISRO", 800, LocalDateTime.of(2023,7,1,10,0), null, "Chemical", 300, "S-Band", 9000000, 15.0, "Radar", "", 50, false, "Failed", 0, "Transfer Orbit");
        probes.add(p497);
        SpaceProbeDto p498 = new SpaceProbeDto("P498", "Mission498", "Mars", "JAXA", 3000, LocalDateTime.of(2011,8,1,10,0), LocalDateTime.of(2015,8,1,10,0), "Solar Electric", 2500, "X-Band", 3000000, 38.0, "Camera", "Camera", 900, true, "Success", 80, "Elliptical");
        probes.add(p498);
        SpaceProbeDto p499 = new SpaceProbeDto("P499", "Mission499", "Jupiter", "NASA", 1400, LocalDateTime.of(2019,9,1,10,0), null, "Ion", 900, "Ka-Band", 40000000, 28.0, "Spectrometer", "Camera", 550, true, "In Progress", 40, "Circular");
        probes.add(p499);
        SpaceProbeDto p500 = new SpaceProbeDto("P500", "Mission500", "Moon", "ESA", 2600, LocalDateTime.of(2008,10,1,10,0), LocalDateTime.of(2010,10,1,10,0), "Chemical", 400, "S-Band", 15000000, 20.0, "Radar", null, 200, false, "Aborted", 8, "Transfer Orbit");
        probes.add(p500);

        System.out.println("Total Size Without filter: " + probes.size());
        Iterator<SpaceProbeDto> itr=probes.iterator();
        //----------------------------------------------filter by status
       /* int sCount=0;
        while(itr.hasNext())
        {
            SpaceProbeDto element=itr.next();
            if(element.getStatus().equalsIgnoreCase("Success"))
            {
                //System.out.println(element);
                sCount++;
            }
        }
        System.out.println("status(Success) matched count: "+sCount);

        itr=probes.iterator();
        int pCount=0;
        while(itr.hasNext())
        {
            SpaceProbeDto element=itr.next();
            if(element.getPropulsionType().equalsIgnoreCase("Solar Electric"))
            {
                //System.out.println(element);
                pCount++;
            }
        }
        System.out.println("propulsionType(Solar Electric) matched count: "+pCount);


        itr = probes.iterator();
        int activeCount = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.isActive()) {
                //System.out.println(element);
                activeCount++;
            }
        }
        System.out.println("Active probes count: " + activeCount);


        itr = probes.iterator();
        int marsCount = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getTargetCelestialBody().equalsIgnoreCase("Mars")) {
                //System.out.println(element);
                marsCount++;
            }
        }
        System.out.println("Mars probes count: " + marsCount);

        itr = probes.iterator();
        int nasaCount = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getManufacturer().equalsIgnoreCase("NASA")) {
                //System.out.println(element);
                nasaCount++;
            }
        }
        System.out.println("NASA probes count: " + nasaCount);

        itr=probes.iterator();
        int missionDurationCount=0;

        while(itr.hasNext())
        {
            SpaceProbeDto element=itr.next();
            if (element.getMissionDurationDays()>365)
            {
                //System.out.println(element);
                missionDurationCount++;
            }
        }
        System.out.println("Mission duration > 365 days count: " + missionDurationCount);

        itr=probes.iterator();
        int powerOutput=0;

        while(itr.hasNext())
        {
            SpaceProbeDto element=itr.next();
            if(element.getPowerOutput()>1000)
            {
                //System.out.println(element);
                powerOutput++;
            }
        }
        System.out.println("power output >1000 watts count: "+powerOutput);


        //---------------------------------remove by status

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getStatus().equalsIgnoreCase("Failed")) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getFuelRemaining() < 10) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (!element.isActive()) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getTargetCelestialBody().equalsIgnoreCase("Moon")) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getMissionDurationDays() < 100) {
                itr.remove();
            }
        }
        System.out.println(probes.size());
*/

        //-----------------------Multiple Property Conditions
        itr=probes.iterator();
        int count1 = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getStatus().equalsIgnoreCase("Success")
                    && element.isActive()) {
                //System.out.println(element);
                count1++;
            }
        }
        System.out.println("elements having status(Success) and  isActive(true): "+count1);

    /*    itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getFuelRemaining() < 20
                    && element.getStatus().equalsIgnoreCase("Failed")) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();
        int count2 = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getTargetCelestialBody().equalsIgnoreCase("Mars")
                    && element.getManufacturer().equalsIgnoreCase("ESA")) {
                System.out.println(element);
                count2++;
            }
        }
        System.out.println(count2);

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getLaunchMass() > 2000
                    && element.getPowerOutput() < 1000) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();
        int count3 = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getMissionDurationDays() > 500
                    && element.isActive()) {
                System.out.println(element);
                count3++;
            }
        }
        System.out.println(count3);

        //Iterator<SpaceProbeDto> itr = probes.iterator();
        int count = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getLaunchDate()
                    .isBefore(LocalDateTime.now().minusYears(2))) {
                System.out.println(element);
                count++;
            }
        }
        System.out.println(count);

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            long days = ChronoUnit.DAYS.between(
                    element.getLaunchDate(),
                    LocalDateTime.now());

            if (days > element.getMissionDurationDays()) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();
        int count4 = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getStatus().equalsIgnoreCase("Success")
                    && element.getFuelRemaining() > 30
                    && element.getPowerOutput() > 800) {
                System.out.println(element);
                count4++;
            }
        }
        System.out.println(count4);

        itr = probes.iterator();

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if (element.getTargetCelestialBody().equalsIgnoreCase("Pluto")
                    || element.getDistanceFromEarth() > 50000000) {
                itr.remove();
            }
        }
        System.out.println(probes.size());

        itr = probes.iterator();
        int count5 = 0;

        while (itr.hasNext()) {
            SpaceProbeDto element = itr.next();

            if ((element.getPrimaryInstrument().contains("Camera")
                    || (element.getSecondaryInstrument() != null
                    && element.getSecondaryInstrument().contains("Camera")))
                    && element.getStatus().equalsIgnoreCase("Success")) {
                System.out.println(element);
                count5++;
            }
        }
        System.out.println(count5);*/
    }
}
