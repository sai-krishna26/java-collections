package com.xworkz.collections.genericsRecap.example1;

public class Example1<T,T1,T2> {
    public T orderId;
    public T1 pincode;
    public T2 secreteLetter;
    public String paymentMode;

    public void crosCheck() {
        System.out.println(orderId+"\n"+pincode+"\n"+secreteLetter+"\n"+paymentMode);
    }
}
