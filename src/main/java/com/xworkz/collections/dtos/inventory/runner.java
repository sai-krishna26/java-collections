package com.xworkz.collections.dtos.inventory;

import java.util.LinkedList;

public class runner {
    public static void main(String[] args) {
        InventoryDto inv1 = new InventoryDto(1, "Laptop", 50, "Warehouse A", "TechSupply");
        InventoryDto inv2 = new InventoryDto(2, "Mouse", 200, "Warehouse B", "TechSupply");
        InventoryDto inv3 = new InventoryDto(3, "Keyboard", 150, "Warehouse A", "PeripheralsInc");
        InventoryDto inv4 = new InventoryDto(4, "Monitor", 80, "Warehouse C", "DisplayCo");
        InventoryDto inv5 = new InventoryDto(5, "Headset", 120, "Warehouse B", "AudioWorld");

        LinkedList<InventoryDto> inventoryDtos = new LinkedList<>();
        inventoryDtos.add(inv1);
        inventoryDtos.add(inv2);
        inventoryDtos.add(inv3);
        inventoryDtos.add(inv4);
        inventoryDtos.add(inv5);

        inventoryDtos.addFirst(new InventoryDto(0, "USB Cable", 500, "Warehouse A", "CablesRUs"));
        inventoryDtos.addLast(new InventoryDto(6, "Webcam", 60, "Warehouse C", "TechSupply"));

        System.out.println("Total size: " + inventoryDtos.size());
        System.out.println("First item: " + inventoryDtos.getFirst());
        System.out.println("Last item: " + inventoryDtos.getLast());

        for (InventoryDto dto : inventoryDtos) {
            System.out.println(dto);
        }
    }
}
