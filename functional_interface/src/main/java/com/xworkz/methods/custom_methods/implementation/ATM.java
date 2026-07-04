package com.xworkz.methods.custom_methods.implementation;

@FunctionalInterface
public interface ATM {
    boolean withdraw(double amount, int pin);
}
