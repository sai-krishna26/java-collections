package com.xworkz.collections.dtos.supplier;

import java.util.HashSet;

public class runner {
    public static void main(String[] args) {
        SupplierDto sup1 = new SupplierDto(1, "TechSupply", "123 Tech St, Bangalore", "Raj", "9876543210");
        SupplierDto sup2 = new SupplierDto(2, "PeripheralsInc", "456 Peripherals Ave, Mumbai", "Priya", "9876543211");
        SupplierDto sup3 = new SupplierDto(3, "DisplayCo", "789 Display Rd, Delhi", "Amit", "9876543212");
        SupplierDto sup4 = new SupplierDto(4, "AudioWorld", "321 Audio Ln, Chennai", "Sneha", "9876543213");
        SupplierDto sup5 = new SupplierDto(5, "CablesRUs", "654 Cable Blvd, Hyderabad", "Vikram", "9876543214");

        HashSet<SupplierDto> supplierDtos = new HashSet<>();
        supplierDtos.add(sup1);
        supplierDtos.add(sup2);
        supplierDtos.add(sup3);
        supplierDtos.add(sup4);
        supplierDtos.add(sup5);


        SupplierDto duplicate = new SupplierDto(1, "TechSupply", "Different Address", "Different Person", "9999999999");
        boolean added = supplierDtos.add(duplicate);
        System.out.println("Duplicate added: " + added);

        System.out.println("Total size: " + supplierDtos.size());

        for (SupplierDto dto : supplierDtos) {
            System.out.println(dto);
        }
    }
}
