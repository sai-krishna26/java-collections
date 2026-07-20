package com.xworkz.map.runner;

import com.xworkz.map.dto.BankAccountDto;

import java.util.HashMap;
import java.util.Map;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccountDto bankAccountDto = new BankAccountDto();
        Map<Integer, BankAccountDto> bankAccount = new HashMap<>();
        bankAccount.put(1, new BankAccountDto("ACC123456", "Raju"));
        bankAccount.put(2, new BankAccountDto("ACC789012", "Priya"));
        bankAccount.put(3, new BankAccountDto("ACC345678", "Amit"));
        bankAccount.put(4, new BankAccountDto("ACC901234", "Sneha"));
        bankAccount.put(5, new BankAccountDto("ACC567890", "Vikram"));
        bankAccount.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println(bankAccount.keySet());
        System.out.println(bankAccount.values());
        System.out.println("size of the map: " + bankAccount.size());
        bankAccount.clear();
        System.out.println("size after clear: " + bankAccount.size());
    }
}
