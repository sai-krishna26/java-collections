package com.xworkz.methods.inbuilt_methods;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Execution
{
    public static void main(String[] args)
    {
        BiConsumer<String, Integer> bitConsumer = (name, age) -> System.out.println("Name:" + name + "\nAge:" + age);
        bitConsumer.accept("ravi", 49);
        System.out.println("-----------------------------------------------------------");

        BiFunction<Boolean, Character, Boolean> biFunction = (vote, gender) ->
        {
            System.out.println("vote:" + vote + "\nGender:" + gender);
            return vote;
        };
        biFunction.apply(true,'M');
        System.out.println("--------------------------------------------------------------");


        BinaryOperator<Long> binaryOperator=(mobileNumber,adhar)->
        {
            System.out.println("mobile number:" + mobileNumber+"\nadhar:"+adhar);
            return mobileNumber;
        };
        binaryOperator.apply(123456789L,235533221234L);
        System.out.println("---------------------------------------------------------------");

        BiPredicate<Integer,Integer> biPredicate=(number,number2)->
        {
            System.out.println("id:"+number+"\nrange:"+number2);
            return number>number2;
        };
        biPredicate.test(8765,34567);
        System.out.println("---------------------------------------------------------------");
    }
}