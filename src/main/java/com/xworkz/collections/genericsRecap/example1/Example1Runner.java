package com.xworkz.collections.genericsRecap.example1;

public class Example1Runner {
    public static void main(String[] args) {
        Example1<String,Integer,Character> example1=new Example1<>();
        example1.orderId="STS76542";
        example1.pincode=585214;
        example1.secreteLetter='&';
        example1.paymentMode="cod";
        example1.crosCheck();
    }
}
