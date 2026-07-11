package com.xworkz.sort.runner;

import com.xworkz.sort.dto.ProductDto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductComparableCollectionsSort {
    public static void main(String[] args) {
        System.out.println("=== Comparable + Collections.sort() ===");
        System.out.println("Sorting by productName (natural ordering defined in compareTo)");

        ProductDto product1 = new ProductDto(101, "Laptop", 59999.99, true, LocalDate.of(2025, 12, 31));
        ProductDto product2 = new ProductDto(102, "Mouse", 999.50, true, LocalDate.of(2026, 6, 30));
        ProductDto product3 = new ProductDto(103, "Keyboard", 2499.00, true, LocalDate.of(2026, 3, 15));
        ProductDto product4 = new ProductDto(104, "Monitor", 14999.00, true, LocalDate.of(2025, 9, 20));
        ProductDto product5 = new ProductDto(105, "Headphones", 3999.00, false, LocalDate.of(2026, 1, 10));

        List<ProductDto> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);

        System.out.println("\nBefore sorting:");
        products.forEach(System.out::println);

        // Using Comparable with Collections.sort()
        Collections.sort(products);

        System.out.println("\nAfter sorting by productName (Comparable):");
        products.forEach(System.out::println);
    }
}
