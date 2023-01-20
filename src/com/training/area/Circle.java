package com.training.area;

public class Circle extends Shape{
    int radius;

    public Circle() {
        super();
    }

    public double calculateArea(int radius){
        return 3.14*radius*radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public Circle(String shapeName, int radius) {
        super();
        this.radius = radius;
    }
}
