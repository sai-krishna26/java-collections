package com.xworkz.streamapi.filter;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Country {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("India");
        list.add("Pakistan");
        list.add("Bangladesh");
        list.add("Nepal");
        list.add("Bhutan");
        list.add("Sri Lanka");
        list.add("Maldives");
        list.add("Norway");
        list.add("Sweden");
        list.add("Finland");
        list.add("Russia");
        list.add("Germany");
        list.add("Austria");
        list.add("Belgium");
        list.add("France");
        list.add("Italy");
        list.add("Netherlands");
        list.add("Spain");
        list.add("Switzerland");
        list.add("United Kingdom");
        list.add("United States");
        list.add("Canada");
        list.add("Australia");
        list.add("New Zealand");
        list.add("China");
        list.add("Japan");
        list.add("South Korea");
        list.add("Indonesia");
        list.add("Malaysia");
        list.add("Thailand");
        list.add("Vietnam");
        list.add("Philippines");
        list.add("Singapore");
        list.add("Indonesia");
        list.add("Mexico");
        list.add("Cuba");
        list.add("Brazil");
        list.add("Argentina");
        list.add("Peru");
        list.add("Colombia");
        list.add("Ecuador");
        list.add("Venezuela");
        list.add("Uruguay");
        list.add("Bolivia");
        list.add("Paraguay");

        System.out.println("------------------starts with(I)-----------------");
        Predicate<String> predicate=(names)->names.startsWith("I");
        Consumer<String> consumer=name->System.out.println(name);
        list.stream()
                .filter(predicate)
                .forEach(consumer);

        System.out.println("----------------ends with(a)---------------------");
        list.stream()
                .filter(names1-> names1.endsWith("a"))
                .forEach(System.out::println);

        System.out.println("------------2 or more words-------------------------");
        list.stream()
                .filter(names2->names2.contains(" "))
                .forEach(System.out::println);

        System.out.println("---------------length>=10-----------------------------");
        list.stream()
                .filter(names3->names3.length()>=10)
                .forEach(System.out::println);

        System.out.println("------------------length=<5---------------------------");
        list.stream()
                .filter(names4->names4.length()<=5)
                .forEach(System.out::println);

        System.out.println("------------------print all---------------------------");
        list.stream()
                .forEach(System.out::println);


    }
}
