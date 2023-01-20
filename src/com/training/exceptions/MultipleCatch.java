package com.training.exceptions;

public class MultipleCatch {
    public void TestMultiple(String s,int a,int b){
        try {
            System.out.println("The length of the String from user is " + s.length());

            System.out.println("The Quotient of 2 numbers is " + a / b);
        }catch (ArithmeticException e) {
                System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
