package com.lakshmi.decoratornew;


public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Plain pizza";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
