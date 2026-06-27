package com.xworkz.collections.dtos.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sun.awt.windows.WPrinterJob;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
public class CustomerDto implements Serializable {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String address;
}