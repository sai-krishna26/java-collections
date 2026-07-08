package com.xworkz.streamapi.filter;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Pincode {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Agra", 280001L));
        cities.add(new City("Delhi", 110001L));
        cities.add(new City("Mumbai", 400001L));
        cities.add(new City("Bangalore", 560001L));
        cities.add(new City("Hyderabad", 500001L));
        cities.add(new City("Chennai", 380001L));
        cities.add(new City("Kolkata", 302001L));
        cities.add(new City("Surat", 411001L));
        cities.add(new City("Pune", 800001L));
        cities.add(new City("Ahmedabad", 690001L));
        cities.add(new City("Jaipur", 682001L));
        cities.add(new City("Lucknow", 452001L));
        cities.add(new City("Thane", 300001L));
        cities.add(new City("Nagpur", 440001L));
        cities.add(new City("Visakhapatnam", 530001L));
        cities.add(new City("Kanpur", 208001L));
        cities.add(new City("Ludhiana", 148001L));
        cities.add(new City("Chandigarh", 160001L));
        cities.add(new City("Ranchi", 834001L));
        cities.add(new City("Patna", 800001L));
        cities.add(new City("Surendranagar", 395001L));
        cities.add(new City("Allahabad", 356001L));
        cities.add(new City("Jodhpur", 346001L));
        cities.add(new City("Coimbatore", 641001L));
        cities.add(new City("Faridabad", 121001L));
        cities.add(new City("Meerut", 250001L));
        cities.add(new City("Vadodara", 390001L));
        cities.add(new City("Jalandhar", 144001L));
        cities.add(new City("Gwalior", 474001L));
        cities.add(new City("Gurgaon", 122001L));
        cities.add(new City("Noida", 201001L));
        cities.add(new City("Bhopal", 452001L));
        cities.add(new City("Indore", 452001L));
        cities.add(new City("Guwahati", 782001L));
        cities.add(new City("Vijayawada", 520001L));
        cities.add(new City("Kochi", 682001L));
        cities.add(new City("Madurai", 625001L));
        cities.add(new City("Coimbatore", 641001L));
        cities.add(new City("Nashik", 425001L));
        cities.add(new City("Jamshedpur", 835010L));
        cities.add(new City("Solapur", 415001L));
        cities.add(new City("Varanasi", 220001L));
        cities.add(new City("Kolkata", 302001L));
        cities.add(new City("Nagpur", 440001L));
        cities.add(new City("Surat", 411001L));

        System.out.println("------------------cities with odd pincode numbers---------------------------");
        cities.stream()
                .filter(city-> city.getPincode()%2!=0)
                .forEach(city->System.out.println(city.getName()+","+city.getPincode()));

        System.out.println("------------------cities starting with 'M' or 'D'-------------------------------");
        cities.stream()
                .filter(city-> city.getName().startsWith("M") || city.getName().startsWith("D"))
                .forEach(city-> System.out.println(city.getName()+","+city.getPincode()));

        System.out.println("------------------cities where pincode is divisible by 3-------------------------");
        cities.stream()
                .filter(city->city.getPincode()%3==0)
                .forEach(city->System.out.println(city.getName()+","+city.getPincode()));
    }
}
