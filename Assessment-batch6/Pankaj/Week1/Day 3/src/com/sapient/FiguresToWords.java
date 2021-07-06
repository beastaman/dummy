package com.sapient;

public class FiguresToWords {
    private final String[] oneDigit = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] twoDigits = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] sValue = {"Crore", "Lakhs", "Thousand", "Hundred", "Only"};
    private final Long[] nValue = {10000000l,100000l, 1000l,100l,1l};

    public String getFigures(Long n){
        String word = "";
        for(int i=0;i<nValue.length;i++){
            int n1 = (int)(n/nValue[i]);
            n = n%nValue[i];
            if(n1>0){
                if(n1<=19) word = word+oneDigit[n1]+sValue[i];
                else{
                    word = word+twoDigits[n1/10]+oneDigit[n1%10]+sValue[i];
                }
            }
        }
        return word;
    }
}










//    public FiguresToWords(int num){
//        this.num = num;
//    }
//
//    public String numberToWords() {
//        if (num == 0) return "Zero";
//
//        StringBuilder sb = new StringBuilder();
//        int remainingVal = num;
//        int commas = 0;
//
//        while (remainingVal != 0) {
//            String word = processUpToThreeDigits(remainingVal % 1000);
//
//            remainingVal = remainingVal / 1000;
//
//            if (word.length() > 0 && commas > 0) {
//                sb.insert(0, threeDigits[commas] + " ");
//            }
//
//            sb.insert(0, word); // prepend
//
//            commas++;
//        }
//
//        return sb.toString().trim();
//    }
//
//    private String processUpToThreeDigits(int val) {
//        String str = "";
//
//        if (val > 99) {
//            str = oneDigit[val / 100];
//            str += " Hundred ";
//            val = val % 100;
//        }
//
//        if (val > 19)  {
//            str += twoDigits[val / 10] + " ";
//            val = val % 10;
//        }
//
//        if (val > 0) {
//            str += oneDigit[val] + " ";
//        }
//
//        return str;
//
