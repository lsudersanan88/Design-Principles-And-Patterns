package com.lakshmi.nullObject;



public class PlainPizza implements Pizza1 {
    @Override
    public double cost() {
        return 10.0;
    }

    @Override
    public String description() {
        return  "plain pizza";
    }
}
