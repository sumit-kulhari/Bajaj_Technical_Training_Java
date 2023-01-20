package com.training.inheritance;

public class Parent {
    protected int p=90;

    public Parent(){

    }
    public Parent(int i) {
    this.p = i;
    System.out.println("In parent param constructor");
    }

    public void show(){
        System.out.println("In parent Show");
    }
}
