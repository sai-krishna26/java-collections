package com.xworkz.collections.dtos.shipment;

import java.time.LocalDate;
import java.util.ArrayDeque;

public class runner {
    public static void main(String[] args) {
        ShipmentDto ship1 = new ShipmentDto(1, 101, "FedEx", "FDX123456", LocalDate.now().plusDays(5));
        ShipmentDto ship2 = new ShipmentDto(2, 102, "UPS", "UPS789012", LocalDate.now().plusDays(3));

        ArrayDeque<ShipmentDto> shipmentDtos = new ArrayDeque<>();
        shipmentDtos.add(ship1);
        shipmentDtos.add(ship2);

        System.out.println("Total size: " + shipmentDtos.size());
        System.out.println("First shipment: " + shipmentDtos.getFirst());
        System.out.println("Last shipment: " + shipmentDtos.getLast());

        shipmentDtos.addFirst(new ShipmentDto(0, 100, "Express", "EXP000000", LocalDate.now().plusDays(1)));
        shipmentDtos.addLast(new ShipmentDto(3, 103, "UPS", "UPS111222", LocalDate.now().plusDays(6)));

        System.out.println("\nAfter adding to front and back:");
        System.out.println("First shipment: " + shipmentDtos.getFirst());
        System.out.println("Last shipment: " + shipmentDtos.getLast());

        System.out.println("\nAll shipments:");
        for (ShipmentDto dto : shipmentDtos) {
            System.out.println(dto);
        }

        // Remove from front
        System.out.println("\nRemoved from front: " + shipmentDtos.removeFirst());
        System.out.println("New first shipment: " + shipmentDtos.getFirst());
    }
}
