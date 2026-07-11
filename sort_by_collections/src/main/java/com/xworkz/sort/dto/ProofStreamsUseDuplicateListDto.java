package com.xworkz.sort.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProofStreamsUseDuplicateListDto implements Comparable<ProofStreamsUseDuplicateListDto> {
private int size;
private String colour;
private double price;
private String brand;

    @Override
    public int compareTo(ProofStreamsUseDuplicateListDto o) {
        return o.size-this.size;
    }
}
