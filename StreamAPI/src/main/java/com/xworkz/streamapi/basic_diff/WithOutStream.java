package com.xworkz.streamapi.basic_diff;

import java.util.Arrays;
import java.util.List;

public class WithOutStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,4,5,6,8,9,20);
        for(int number:list)
        {
            if(number%2==0)
            {
                System.out.println(number);
            }
        }
    }
}
