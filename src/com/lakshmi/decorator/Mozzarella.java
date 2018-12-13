package com.lakshmi.decorator;

public class Mozzarella extends ToppingDecorator {


    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    public String getDescription(){

        return tempPizza.getDescription() + ", mozzarella";

    }

    public double getCost(){

        System.out.println("Cost of Moz: " + .50);

        return tempPizza.getCost() + .50;

    }
}
