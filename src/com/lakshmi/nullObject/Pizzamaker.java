package com.lakshmi.nullObject;


public class Pizzamaker {

    public static void main(String[] args) {
        Pizza1 basicPizza = new Sauce(new Cheese(new PlainPizza()));

        System.out.println("Ingredients: " + basicPizza.description());

        System.out.println("Price: " + basicPizza.cost());
    }
}
