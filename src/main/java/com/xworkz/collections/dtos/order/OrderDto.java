package com.xworkz.collections.dtos.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class OrderDto {
    private int orderId;
    private int customerId;
    private LocalDate orderDate;
    private String status;
    private double totalAmount;
}
