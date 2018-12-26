package com.lakshmi.singleton.SingletonNew;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonReflection {
    private static  SingletonReflection soleInstance = new SingletonReflection();

    private SingletonReflection()
    {
        /*if(soleInstance!= null)
        {
            throw new RuntimeException("Singleton object, cannot create more!");
        }*/
    }

    public static SingletonReflection getInstance()
    {

        return soleInstance;
    }




}
class  TestSingletonReflection{

    public static void main(String[] args) throws Exception{

        SingletonReflection singleton1 = SingletonReflection.getInstance();
        SingletonReflection singleton2 = SingletonReflection.getInstance();
        print("s1",singleton1);
        print("s2",singleton2);


        Class aClass = Class.forName("com.lakshmi.singleton.SingletonNew.SingletonReflection");
        Constructor<SingletonReflection> constructor = aClass.getDeclaredConstructor();
       // System.out.println(constructor);
        constructor.setAccessible(true);
        SingletonReflection singleton3 = constructor.newInstance();
        print("s3",singleton3);


    }
    static void print(String name, SingletonReflection object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));
    }

}