package com.sapient;

import java.util.Arrays;

public class AdditionOfTwoNumbers {
    public int getAddition(Integer... num){
        return Arrays.stream(num).mapToInt(Integer::intValue).sum();
    }
    public String getAddition(char... chars){
        return String.valueOf(chars);
    }

    public String getAddition(String... strs){
        return String.join("", strs);
    }
}
