package com.training.inheritance;

public class Child extends Parent{

    private int c=10;

    public Child() {
        super();
        this.c = c;
        System.out.println("In child class param constructor");
    }

    public void show(){
        System.out.println("In child Show");
    }
    public void addition(){
        int sum = p+c;
        System.out.println("Sum = "+sum);
    }
}
