package com.example.classBankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> coin = new ArrayList<>();

        coin.add("EUR");
        coin.add("USD");
        coin.add("GBP");
        coin.add("CHF");
        coin.add("CNY");
        coin.add("AUD");

        System.out.println(coin);

    }
}
