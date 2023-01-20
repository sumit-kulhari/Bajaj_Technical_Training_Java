package com.training.inheritance;

public class TestInheritance {
    public static void main(String args[]){
        Child chd = new Child();
        chd.show();
        chd.addition();
        Parent ref;
        ref = new Parent();
        ref.show();
        ref = new Child();
        ref.show();
    }
}
