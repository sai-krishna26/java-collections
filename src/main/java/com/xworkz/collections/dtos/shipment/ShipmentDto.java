package com.xworkz.collections.dtos.shipment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ShipmentDto implements Serializable {
    private int shipmentId;
    private int orderId;
    private String carrier;
    private String trackingNumber;
    private LocalDate deliveryDate;
}
