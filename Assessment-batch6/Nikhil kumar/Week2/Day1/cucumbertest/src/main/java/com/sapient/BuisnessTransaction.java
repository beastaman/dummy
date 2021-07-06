package com.sapient;

public class BuisnessTransaction {

    public int doPurchaseTransaction(int amount){
        if(amount < 20000) return 0;
        else if(amount >= 20000 && amount <= 100000) return (int)(amount*0.05);
        else return (int)(amount*0.20);
    }
}
