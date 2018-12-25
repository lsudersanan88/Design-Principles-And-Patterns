package com.lakshmi.nullObject;

public class Cheese extends Decorator {
    public Cheese(Pizza1 pizza) {
        super(pizza);
    }


    public double cost() {
        return pizza.cost()+10.00;
    }


    public String description() {
        return pizza.description() + ", mozzarella";
    }
}
