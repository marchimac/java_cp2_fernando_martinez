package com.example.currency;

import java.util.ArrayList;
import java.util.List;

public class CurrencyList {
    public static void main(String[] args) {
        List<String> currency = new ArrayList<>();
        currency.add("EUR");
        currency.add("USD");
        currency.add("GBP");
        currency.add("CHF");
        currency.add("CNY");
        currency.add("AUD");
        System.out.println(currency);
    }
}
