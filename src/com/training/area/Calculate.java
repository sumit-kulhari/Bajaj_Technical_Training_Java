package com.training.area;

public class Calculate {
    public static void main(String args[]){
        Circle circle = new Circle();
        circle.setShapeName("Circle");
        System.out.println(circle.getShapeName());
        System.out.println(circle.calculateArea(9));
        Rectangle rectangle = new Rectangle();
        Square square = new Square();


    }
}
