package com.lakshmi.singleton.SingletonNew;

public class Singleton {

    private static  Singleton soleInstance = new Singleton();

    private Singleton()
    {
    }


    public static Singleton getInstance()
    {

        return soleInstance;
    }

}
class  Test{

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        print("s1",singleton1);
        print("s2",singleton2);
    }
    static void print(String name, Singleton object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));
    }

}