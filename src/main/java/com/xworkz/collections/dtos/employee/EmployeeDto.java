package com.xworkz.collections.dtos.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeDto implements Serializable {
    private int employeeId;
    private  String name;
    private String department;
    private String designation;
    private double salary;
}
