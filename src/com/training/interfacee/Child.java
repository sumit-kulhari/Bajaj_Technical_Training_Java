package com.training.interfacee;

public class Child implements Parent,Parent1{
    @Override
    public void display() {
        System.out.println("Method from 1st interface");
    }

    @Override
    public void show() {
        System.out.println("Method from 2nd interface");
    }
}
