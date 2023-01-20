package com.training.exceptions;

public class Divide {
    public void printQuotient(int a,int b){
        try {
            System.out.println("The Quotient of 2 numbers is "+a/b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Inside finally block");
        }
    }
}
