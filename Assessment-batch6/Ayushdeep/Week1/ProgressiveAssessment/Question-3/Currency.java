package com.company;
import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
    private String name1;
    private String name2;
    private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();

    public Currency(String name1, String name2, HashMap<String, Double> exchangeValues) {
        this.name1 = name1;
        this.name2 = name2;
        this.exchangeValues = exchangeValues;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public HashMap<String, Double> getExchangeValues() {
        return exchangeValues;
    }

    public void setExchangeValues(HashMap<String, Double> exchangeValues) {
        this.exchangeValues = exchangeValues;
    }

    public void defaultValues() {
        String currency = this.name1;

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
        double ans = exchangeValues.get(s2);
        return ans*amt;
    }
}