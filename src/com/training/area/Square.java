package com.training.area;

public class Square extends Shape{
    int side;

    public Square(String shapeName, int side) {
        super();
        this.side = side;
    }

    public Square() {

    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public double calculateArea(int side){
        return side*side;
    }
}
