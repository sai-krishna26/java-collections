package com.xworkz.collections.dtos.invoice;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class runner {
    public static void main(String[] args) {
        InvoiceDto inv1 = new InvoiceDto(1, 101, 5000.0, LocalDate.now().plusDays(30), "Pending");
        InvoiceDto inv2 = new InvoiceDto(2, 102, 1500.0, LocalDate.now().plusDays(15), "Paid");
        InvoiceDto inv3 = new InvoiceDto(3, 103, 8000.0, LocalDate.now().plusDays(45), "Pending");
        InvoiceDto inv4 = new InvoiceDto(4, 104, 2500.0, LocalDate.now().plusDays(20), "Overdue");
        InvoiceDto inv5 = new InvoiceDto(5, 105, 10000.0, LocalDate.now().plusDays(60), "Pending");

        PriorityQueue<InvoiceDto> invoiceDtos = new PriorityQueue<>();
        invoiceDtos.add(inv1);
        invoiceDtos.add(inv2);
        invoiceDtos.add(inv3);
        invoiceDtos.add(inv4);
        invoiceDtos.add(inv5);

        System.out.println("Total size: " + invoiceDtos.size());
        System.out.println("Peek (lowest amount): " + invoiceDtos.peek());

        System.out.println("\nProcessing invoices in order of amount (lowest first):");
        while (!invoiceDtos.isEmpty()) {
            System.out.println("Processing: " + invoiceDtos.poll());
        }
    }
}
