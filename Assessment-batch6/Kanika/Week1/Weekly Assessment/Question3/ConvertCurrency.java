package com.sapient;
import java.util.ArrayList;
import java.util.HashMap;

public class ConvertCurrency {
    private String currency1;
    private String currency2;
    private HashMap<String, Double> currencyExchange = new HashMap<String, Double>();

    public Currency(String currency1, String currency2, HashMap<String, Double> currencyExchange) {
        this.currency1 = currency1;
        this.currency2 = currency2;
        this.currencyExchange = currencyExchange;
    }

    public String getCurrency1() {
        return currency1;
    }

    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }

    public HashMap<String, Double> getCurrencyExchange() {
        return currencyExchange;
    }

    public void setCurrencyExchange(HashMap<String, Double> currencyExchange) {
        this.currencyExchange = currencyExchange;
    }

    public void defaultValues() {
        String currency = this.currency1;

        switch (currency) {
            case "America":
                this.exchangeValues.put("America", 1.00);
                this.exchangeValues.put("UK", 0.93);
                this.exchangeValues.put("India", 74.21);
                this.exchangeValues.put("Japan", 123.54);
                break;
            case "UK":
                this.exchangeValues.put("America", 1.073);
                this.exchangeValues.put("UK", 1.00);
                this.exchangeValues.put("India", 88.51);
                this.exchangeValues.put("Japan", 132.19);
                break;
            case "India":
                this.exchangeValues.put("America", 0.013);
                this.exchangeValues.put("UK", 0.011);
                this.exchangeValues.put("India", 1.00);
                this.exchangeValues.put("Japan", 1.49);
            case "Japan":
                this.exchangeValues.put("America", 0.0090);
                this.exchangeValues.put("UK", 0.0076);
                this.exchangeValues.put("India", 0.67);
                this.exchangeValues.put("Japan", 1.00);
        }
    }
    public double compute(String s2, double amt){
        double ans = currencyExchange.get(s2);
        return ans*amt;
    }
}