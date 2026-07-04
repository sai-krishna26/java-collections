package com.xworkz.methods.custom_methods.implementation;

@FunctionalInterface
public interface Restaurant {
    double calculateBill(String food, int quantity, double gst);
}
