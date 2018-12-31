package com.lakshmi.factoryNew;

public class AnimalFactory {

    public Animal getAnimal( String animalType )
    {
        Animal animal = null;
        if( "dog".equals(animalType) )
        {
            animal = new Dog();
        }
        else if( "cat".equals(animalType) )
        {
            animal = new Cat();
        }
        return animal;
    }
}
