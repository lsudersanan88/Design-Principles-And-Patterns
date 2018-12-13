package com.lakshmi.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle  = shapeFactory.getInstance("CIRCLE");
        circle.draw();

    }
}
