package com.xworkz.sort.runner;

import com.xworkz.sort.dto.ProofStreamsUseDuplicateListDto;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.StreamSupport.stream;

public class ProofStreamsUseDuplicateListRunner {
    public static void main(String[] args)
    {
        ProofStreamsUseDuplicateListDto proofStreamsUseDuplicateListDto=new ProofStreamsUseDuplicateListDto(23,"red",123.45,"X");
        ProofStreamsUseDuplicateListDto proofStreamsUseDuplicateListDto2=new ProofStreamsUseDuplicateListDto(20,"blue",160.78,"CG");
        ProofStreamsUseDuplicateListDto proofStreamsUseDuplicateListDto3=new ProofStreamsUseDuplicateListDto(25,"green",180.99,"Z");
        ProofStreamsUseDuplicateListDto proofStreamsUseDuplicateListDto4=new ProofStreamsUseDuplicateListDto(22,"yellow",130.50,"Y");
        List<ProofStreamsUseDuplicateListDto> list=new ArrayList<>();
        list.add(proofStreamsUseDuplicateListDto);
        list.add(proofStreamsUseDuplicateListDto2);
        list.add(proofStreamsUseDuplicateListDto3);
        list.add(proofStreamsUseDuplicateListDto4);

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println(list+"\n");
    }
}
