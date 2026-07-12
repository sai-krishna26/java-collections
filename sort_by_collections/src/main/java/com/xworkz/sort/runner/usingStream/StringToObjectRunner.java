package com.xworkz.sort.runner.usingStream;

import com.xworkz.sort.dto.StringToObjectDto;

import java.util.ArrayList;
import java.util.List;

public class StringToObjectRunner {
    public static void main(String[] args) {

       List<String> stringList=new ArrayList<>();
       stringList.add("sanchari");
       stringList.add("viveki");
       stringList.add("chinmayi");
       stringList.add("ram-laxman");
       stringList.add("urvashi");
       stringList.add("indra");

       stringList.stream()
               .filter(list->!list.isEmpty())
               .sorted()
               .map(ref->new StringToObjectDto("NA"))
               .forEach(System.out::println);
    }
}
