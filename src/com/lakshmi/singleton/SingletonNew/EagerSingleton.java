package com.lakshmi.singleton.SingletonNew;

public class EagerSingleton {

    private static  EagerSingleton soleInstance = new EagerSingleton(); //Eager loading

    private EagerSingleton()
    {
    }


    public static EagerSingleton getInstance()
    {

        return soleInstance;
    }

}
class  Test{

    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();
        print("s1",singleton1);
        print("s2",singleton2);
    }
    static void print(String name, EagerSingleton object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));
    }

}