package com.lakshmi.nullObject;

public abstract class Decorator implements Pizza1 {
    protected Pizza1 pizza;

    public Decorator(Pizza1 pizza) {
        this.pizza = pizza;
    }


    public double cost() {
      return pizza.cost();
    }


    public String description() {
        return pizza.description();
    }
}
