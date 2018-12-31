package com.lakshmi.decoratornew;


public class Client {
    public static void main(String[] args) {

        Pizza chickenPizza = new ChickenPizza(new PlainPizza());

        System.out.println("Ingredients: " + chickenPizza.getDescription());

        System.out.println("Price: " + chickenPizza.getCost());
    }
}
