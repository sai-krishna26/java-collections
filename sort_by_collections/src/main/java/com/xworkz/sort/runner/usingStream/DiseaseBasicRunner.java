package com.xworkz.sort.runner.usingStream;

import com.xworkz.sort.dto.DiseaseDto;
import com.xworkz.sort.sort.usingStreamSort.comparator.DiseaseEtiologyComparator;
import com.xworkz.sort.sort.usingStreamSort.comparator.DiseaseNameComparator;
import com.xworkz.sort.sort.usingStreamSort.comparator.DiseaseSymptomsComparator;
import netscape.security.UserTarget;

import java.util.*;
import java.util.stream.Collectors;

public class DiseaseBasicRunner {
    public static void main(String[] args) {
        DiseaseDto diseaseDto=new DiseaseDto(1,"null","Throat cancer due to narcotics","respiration problem","cigerate,coal smoke","radiotherapy","maintain healthy lifestyle","curable","infectious");
        DiseaseDto diseaseDto2=new DiseaseDto(2,"Tuberculosis","Tuberculosis due to bacteria","respiration problem","cigerate,coal smoke","surgery","maintain healthy lifestyle","curable","infectious");
        DiseaseDto diseaseDto3=new DiseaseDto(3,"Malaria","Malaria due to parasite","respiration problem","cigerate,coal smoke","surgery","maintain healthy lifestyle","curable","infectious");
        DiseaseDto diseaseDto4=new DiseaseDto(4,"AIDS","AIDS due to virus","respiration problem","cigerate,coal smoke","surgery","maintain healthy lifestyle","curable","infectious");
        DiseaseDto diseaseDto5=new DiseaseDto(5,"Tetanus","Tetanus due to bacteria","respiration problem","cigerate,coal smoke","surgery","maintain healthy lifestyle","curable","infectious");
        DiseaseDto diseaseDto6=new DiseaseDto(6,"Kidney Failure","Kidney failure due to disease","difficulty in breathing","stress,diabetes","dialysis","stress,stop smoking","non-curable","chronic");


        List<DiseaseDto> diseases=new ArrayList<>();
        diseases.add(diseaseDto);
        diseases.add(diseaseDto2);
        diseases.add(diseaseDto3);
        diseases.add(diseaseDto4);
        diseases.add(diseaseDto5);
        diseases.add(diseaseDto6);


        System.out.println("----------------Length > 5----------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getName().length()>5)
                .sorted(new DiseaseNameComparator())
                .map(diseasedto->diseasedto.getName())
                .forEach(System.out::println);

        System.out.println("----------------StartsWith T----------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getName().startsWith("T"))
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .forEach(System.out::println);

        System.out.println("-------------------names to UPPERCASE------------------");
        diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .sorted(new DiseaseNameComparator())
                .map(diseasedto->diseasedto.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("-------------------names to lowercase------------------");
        diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .sorted(new DiseaseNameComparator())
                .map(diseasedto->diseasedto.getName().toLowerCase())
                .forEach(System.out::println);

        System.out.println("-------------------each String length---------------------");
        diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .sorted(new DiseaseNameComparator())
                .map(diseasedto->diseasedto.getName()+"->"+diseasedto.getName().length())
                .forEach(System.out::println);

        System.out.println("-------------------filter  id>2 and double it---------------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getId()>=2)
                .sorted()
                .map(diseasedto->diseasedto.getId()+" double of id->"+diseasedto.getId()*2)
                .forEach(System.out::println);

        System.out.println("-------------------name.length>4 & symptoms.length>4---------------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getName().length()>4 && diseasedto.getSymptoms().length()>4)
                .sorted(new DiseaseSymptomsComparator())
                .map(diseasedto->diseasedto.getName()+" & "+diseasedto.getSymptoms()+" -> both have length>4")
                .forEach(System.out::println);

        System.out.println("-------------------Remove nulls---------------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getName()!=null)
                .sorted(Comparator.comparing(
                                DiseaseDto::getName,
                                Comparator.nullsLast(String::compareTo)
                        ))
                .map(DiseaseDto::getName)
                .forEach(System.out::println);

        System.out.println("-------------------Object to Boolean-------------------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getSymptoms().length()>5)
                .sorted()
                .map(diseasedto->diseasedto.getSymptoms().contains("respiration"))
                .forEach(System.out::println);


        //--------------------Terminal operations------------------------------

        System.out.println("----------------------------count----------------------------");
        long count=diseases.stream()
                .filter(diseasedto->!diseasedto.getEtiology().isEmpty())
                .sorted(new DiseaseEtiologyComparator())
                .map(diseasedto->diseasedto.getEtiology().concat(" root"))
                .count();
        System.out.println("count value ="+count);

        System.out.println("----------------------------Count all----------------------------");
        long totalCount=diseases.stream().count();
        System.out.println("Total count ="+totalCount);

        System.out.println("----------------------------Collect to list----------------------------");
        List<String> names = diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .collect(Collectors.toList());
                // or names.forEach(System.out::println);
        System.out.println(names);

        System.out.println("----------------------------Collect to set----------------------------");
        Set<String>names1=diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .map(DiseaseDto::getName)
                .distinct()
                .collect(Collectors.toSet());
                names1.forEach(System.out::println);
        System.out.println("set size: "+names1.size());

        System.out.println("----------------------------Collect to map----------------------------");
        Map<Integer,String> diseaseMap=diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .collect(Collectors.toMap(DiseaseDto::getId,DiseaseDto::getName));
        System.out.println("Collected map ="+diseaseMap);


        System.out.println("----------------------------Collect joining----------------------------");
        String joinedNames=diseases.stream()
                .filter(diseasedto->!diseasedto.getName().isEmpty())
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .collect(Collectors.joining(",, "));
        System.out.println("Joined names ="+joinedNames);

        System.out.println("----------------------------Collect grouping----------------------------");
        Map<String,List<DiseaseDto>> groupedByCure=diseases.stream()
                .filter(diseasedto->!diseasedto.getCure().isEmpty())
                .collect(Collectors.groupingBy(DiseaseDto::getCure));
        System.out.println("Grouped by cure ="+groupedByCure);

        System.out.println("----------------------------Collect partitioning----------------------------");
        Map<Boolean,List<DiseaseDto>> partitioned=diseases.stream()
                .collect(Collectors.partitioningBy(diseasedto->diseasedto.getId()>3));
        System.out.println("Partitioned by id>3 ="+partitioned);

        System.out.println("----------------------------Reduce to sum----------------------------");
        int sum=diseases.stream()
                .map(DiseaseDto::getId)
                //.reduce(0,Integer::sum);
                .reduce(0,Integer::sum);
        System.out.println("Sum of ids ="+sum);

        System.out.println("----------------------------Reduce to max----------------------------");
        Optional<Integer> max=diseases.stream()
                .map(DiseaseDto::getId)
                .reduce(Integer::max);
        System.out.println("Max id ="+max.orElse(0));

        System.out.println("----------------------------Reduce to min----------------------------");
        Optional<Integer> min=diseases.stream()
                .map(DiseaseDto::getId)
                .reduce(Integer::min);
        System.out.println("Min id ="+min.orElse(0));

        System.out.println("----------------------------anyMatch----------------------------");
        boolean anyMatch=diseases.stream()
                .anyMatch(diseasedto->diseasedto.getName().startsWith("T"));
        System.out.println("Any name starts with T ="+anyMatch);

        System.out.println("----------------------------allMatch----------------------------");
        boolean allMatch=diseases.stream()
                .allMatch(diseasedto->diseasedto.getId()>0);
        System.out.println("All ids > 0 ="+allMatch);

        System.out.println("----------------------------noneMatch----------------------------");
        boolean noneMatch=diseases.stream()
                .noneMatch(diseasedto->diseasedto.getName().isEmpty());
        System.out.println("None have empty name ="+noneMatch);

        System.out.println("----------------------------Match with filter----------------------------");
        boolean matchWithFilter=diseases.stream()
                .filter(diseasedto->diseasedto.getId()>3)
                .allMatch(diseasedto->diseasedto.getCure().equals("curable"));
        System.out.println("All with id>3 are curable ="+matchWithFilter);

        System.out.println("----------------------------Match empty stream----------------------------");
        boolean emptyMatch=diseases.stream()
                .filter(diseasedto->diseasedto.getName().equals("Fever"))
                .anyMatch(d->true);
        System.out.println("Empty stream anyMatch ="+emptyMatch);

        System.out.println("----------------------------findFirst----------------------------");
        Optional<DiseaseDto> first=diseases.stream()
                .filter(diseasedto->diseasedto.getName().startsWith("T"))
                .findFirst();
        System.out.println("First starting with T ="+first.map(DiseaseDto::getName).orElse("Not found"));

        System.out.println("----------------------------findAny----------------------------");
        Optional<DiseaseDto> any=diseases.stream()
                .filter(diseasedto->diseasedto.getId()>3)
                .findAny();
        System.out.println("Any with id>3 ="+any.map(DiseaseDto::getName).orElse("Not found"));

        System.out.println("----------------------------findFirst with filter----------------------------");
        Optional<DiseaseDto> firstFiltered=diseases.stream()
                .filter(diseasedto->diseasedto.getCure().equals("chronic"))
                .findFirst();
        System.out.println("First chronic ="+firstFiltered.map(DiseaseDto::getName).orElse("Not found"));


        System.out.println("----------------------------distinct----------------------------");
        diseases.stream()
                .map(DiseaseDto::getCure)
                .distinct()
                .forEach(cure->System.out.println("Distinct cures ="+cure));

        System.out.println("----------------------------limit----------------------------");
        diseases.stream()
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .limit(3)
                .forEach(name->System.out.println("First 3 names ="+name));

        System.out.println("----------------------------skip----------------------------");
        diseases.stream()
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .skip(2)
                .forEach(name->System.out.println("Names after skipping 2 ="+name));

        System.out.println("----------------------------limit after filter----------------------------");
        diseases.stream()
                .filter(diseasedto->diseasedto.getName().startsWith("T"))
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .limit(2)
                .forEach(name->System.out.println("First 2 starting with T ="+name));

        System.out.println("----------------------------skip and limit (pagination)----------------------------");
        diseases.stream()
                .sorted(new DiseaseNameComparator())
                .map(DiseaseDto::getName)
                .skip(2)
                .limit(2)
                .forEach(name->System.out.println("Paginated (skip 2, limit 2) ="+name));

        //reverse sorting

        System.out.println("----------------------------reverse sorting----------------------------");
        diseases.stream()
                .sorted(new DiseaseNameComparator().reversed())
                .map(DiseaseDto::getName)
                .forEach(name->System.out.println("Reversed names ="+name));
    }
}
