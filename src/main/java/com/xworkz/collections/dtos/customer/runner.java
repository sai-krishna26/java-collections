package com.xworkz.collections.dtos.customer;

import java.util.ArrayList;
import java.util.Collection;

public class runner {
    public static void main(String[] args){
        CustomerDto customerDto=new CustomerDto(7801,"salaar","salaar@gmail.com",9984302345L,"Hyderabad");
        CustomerDto customerDto1=new CustomerDto(7802,"varada","varada@yahoo.com",9839492421L,"Thiruvananthapuram");
        CustomerDto customerDto2=new CustomerDto(7803,"shiva Mannar","shiva@gmail.com",9876543212L,"vizag");
        CustomerDto customerDto3=new CustomerDto(7804,"vishnu","vishnu@gmail.com",9988776655L,"bengaluru");
        CustomerDto customerDto4=new CustomerDto(7805,"bilal","bilal@outook.com",7856865567L,"Mumbai");

        Collection<CustomerDto> customerDtos=new ArrayList<>(1);
        customerDtos.add(customerDto);
        customerDtos.add(customerDto1);
        customerDtos.add(customerDto2);
        customerDtos.add(customerDto3);
        customerDtos.add(customerDto4);
        customerDtos.add(new CustomerDto(7806,"baba","alibaba@gmail.com",9753186420L,"delhi"));
        System.out.println(customerDto);
        System.out.println("total size of dto: "+customerDtos.size());
    }
}
