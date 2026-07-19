package com.xworkz.map.runner;

import com.xworkz.map.dto.PowerBankDto;

import java.util.HashMap;
import java.util.Map;

public class PowerBankRunner {
    public static void main(String[] args)
    {
        Map<Integer,PowerBankDto> map=new HashMap<>();
        map.put(1,new PowerBankDto("realme",1000,"black",2500.0));
        map.put(2,new PowerBankDto("redme",500,"Red",1500.90));
        map.put(3,new PowerBankDto("x",2000,"white",1000.0));
        map.put(4,new PowerBankDto("x",2000,"white",1000.0));

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
        map.forEach((key,value)->System.out.println(key+" "+value));
        System.out.println(map.containsValue(new PowerBankDto("realme",1000,"black",2500.0)));
        System.out.println(map.keySet());
        System.out.println("size before remove:"+map.size());
        map.remove(4);
        System.out.println("size after remove:"+map.size());
        System.out.println(map.values());
        System.out.println(map.entrySet());


    }
}
