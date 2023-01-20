package com.training.exceptions;

public class Voter {
    public void validateAge(int age){
        try{
            if(age>=18){
                System.out.println("Eligible to vote");
            }else {
                throw new AgeInvalidException("Not eligible to vote");
            }
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
    }

}
