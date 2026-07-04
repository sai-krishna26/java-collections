package com.xworkz.methods.custom_methods.implementation;

@FunctionalInterface
public interface Courier {
    boolean deliverParcel(String address, double weight);
}
