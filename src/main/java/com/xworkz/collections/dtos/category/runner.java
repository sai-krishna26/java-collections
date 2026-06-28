package com.xworkz.collections.dtos.category;

import java.util.TreeSet;

public class runner {
    public static void main(String[] args) {
        CategoryDto cat1 = new CategoryDto(1, "Electronics", "Electronic devices", 0, "Active");
        CategoryDto cat2 = new CategoryDto(3, "Accessories", "Computer accessories", 1, "Active");
        CategoryDto cat3 = new CategoryDto(2, "Computers", "Laptops and desktops", 1, "Active");
        CategoryDto cat4 = new CategoryDto(5, "Audio", "Audio equipment", 1, "Active");
        CategoryDto cat5 = new CategoryDto(4, "Video", "Video equipment", 1, "Active");

        TreeSet<CategoryDto> categoryDtos = new TreeSet<>();
        categoryDtos.add(cat1);
        categoryDtos.add(cat2);
        categoryDtos.add(cat3);
        categoryDtos.add(cat4);
        categoryDtos.add(cat5);

        System.out.println("Total size: " + categoryDtos.size());
        System.out.println("First category: " + categoryDtos.first());
        System.out.println("Last category: " + categoryDtos.last());

        // Using headSet and tailSet
        System.out.println("\nCategories with ID < 4:");
        for (CategoryDto dto : categoryDtos.headSet(cat4)) {
            System.out.println(dto);
        }

        System.out.println("\nAll categories (sorted by ID):");
        for (CategoryDto dto : categoryDtos) {
            System.out.println(dto);
        }
    }
}
