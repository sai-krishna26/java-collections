package com.xworkz.sort.dto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDto implements Serializable,Comparable<ProductDto> {
    private int productId;
    private String productName;
    private double price;
    private boolean isAvailable;
    private LocalDate expiryDate;

    @Override
    public int compareTo(ProductDto o) {
        ProductDto left = this;
        ProductDto right = o;
        return left.productName.compareTo(right.productName);
    }
}
