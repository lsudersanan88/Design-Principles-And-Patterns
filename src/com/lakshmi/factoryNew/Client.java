package com.lakshmi.factoryNew;

import com.lakshmi.factory.Shape;
import com.lakshmi.factory.ShapeFactory;

public class Client {

    public static void main(String[] args)
    {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.getAnimal("dog");
        dog.speak();


    }
}
