package com.lakshmi.nullObject;

public class Sauce extends Decorator {
    public Sauce(Pizza1 pizza) {
        super(pizza);
    }

    public double cost() {
        return pizza.cost()+32.00;
    }


    public String description() {
        return pizza.description() + ", cheese";
    }
}
