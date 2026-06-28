package com.xworkz.collections.dtos.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class runner {
    public static void main(String[] args) {
        OrderDto orderDto=new OrderDto(1,1,LocalDate.of(2025,5,26),"pending",100.0);
        OrderDto orderDto1=new OrderDto(2,2, LocalDate.now(),"paid",240.01);
        OrderDto orderDto2=new OrderDto(3,3,LocalDate.of(2023,4,20),"paid",1500.34);

        List<OrderDto> orderDtos=new ArrayList<>(3);
        orderDtos.add(orderDto);
        orderDtos.add(orderDto1);
        orderDtos.add(orderDto2);
        System.out.println("total size of dto: "+orderDtos.size());
        for(OrderDto dto : orderDtos){
            System.out.println(dto);
        }
    }
}
