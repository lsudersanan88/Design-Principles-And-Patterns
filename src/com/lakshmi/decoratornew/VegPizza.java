package com.lakshmi.decoratornew;

public class VegPizza extends PizzaDecorator{


   public VegPizza(Pizza pizza) {
        super(pizza);
    }

    //override parent methods

    public String getDescription(){

        return pizza.getDescription() + ", veg";

    }

    public double getCost(){

        System.out.println("Cost of veg: " + 1);

        return pizza.getCost() + 1;

    }

}
