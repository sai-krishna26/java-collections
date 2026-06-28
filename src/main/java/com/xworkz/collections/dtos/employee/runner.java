package com.xworkz.collections.dtos.employee;

import java.util.Stack;
import java.util.Vector;

public class runner {
    public static void main(String[] args) {
        EmployeeDto emp1=new EmployeeDto(1,"salaar", "dev","manager", 10000.00);
        EmployeeDto emp2=new EmployeeDto(2,"varada", "dev", "hr",20000.00);
        EmployeeDto emp3=new EmployeeDto(3,"bala", "dev","bussiness",30000.00);
        EmployeeDto emp4=new EmployeeDto(4,"mani", "dev","service",40000.00);
        EmployeeDto emp5=new EmployeeDto(5,"shiva", "dev","QA",50000.00);

        Vector<EmployeeDto> employeeDtos=new Stack<>();
        employeeDtos.add(emp1);
        employeeDtos.add(emp2);
        employeeDtos.add(emp3);
        employeeDtos.add(emp4);
        employeeDtos.add(emp5);
        employeeDtos.remove(0);
        System.out.println("total size of dto: "+employeeDtos.size());

        for(EmployeeDto ed:employeeDtos)
        {
            System.out.println(ed);
        }
    }
}
