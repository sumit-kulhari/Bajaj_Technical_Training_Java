package com.training.area;

public class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle() {

    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle(String shapeName, int length, int breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea(int length, int breadth){
        return length*breadth;
    }
}
