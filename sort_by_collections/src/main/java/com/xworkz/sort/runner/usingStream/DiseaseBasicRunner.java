package com.xworkz.sort.runner.usingStream;

import com.xworkz.sort.dto.DiseaseDto;
import com.xworkz.sort.sort.usingStreamSort.comparator.DiseaseNameComparator;
import com.xworkz.sort.sort.usingStreamSort.comparator.DiseaseSymptomsComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

    }
}
