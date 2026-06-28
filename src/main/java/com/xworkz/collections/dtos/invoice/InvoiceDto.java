package com.xworkz.collections.dtos.invoice;

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
public class InvoiceDto implements Serializable, Comparable<InvoiceDto> {
    private int invoiceId;
    private int orderId;
    private double amount;
    private LocalDate dueDate;
    private String paymentStatus;

    @Override
    public int compareTo(InvoiceDto other) {
        return Double.compare(this.amount, other.amount);
    }
}
