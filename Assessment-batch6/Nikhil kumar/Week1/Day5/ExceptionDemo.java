package com.sapient.day5;

class InsufficientException extends Exception{
    InsufficientException(){
        super("Balance is insufficient........");
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
         for(int i=1;i<=10;i++){
             try{
                 System.out.println(i);
                if(i%5==0) continue;
                 try{
                     System.out.println(i);
                     if(i%3==0) continue;
                     try{
                         System.out.println(i);
                     }catch (Exception e){

                     }finally {
                         System.out.println("I am in inner inner finally");
                     }
                 }catch (Exception e){

                 }finally {
                     System.out.println("I am in inner finally");
                 }
             }catch (Exception e){

             }finally {
                 System.out.println("I am in outer finally");
             }
         }
    }
}
