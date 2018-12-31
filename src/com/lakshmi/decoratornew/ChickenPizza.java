package com.lakshmi.decoratornew;

public class ChickenPizza extends PizzaDecorator{


   public ChickenPizza(Pizza pizza) {
        super(pizza);
    }

    //override parent methods

    public String getDescription(){

        return pizza.getDescription() + ", chicken";

    }

    public double getCost(){

        System.out.println("Cost of chicken: " + .50);

        return pizza.getCost() + .50;

    }

}
