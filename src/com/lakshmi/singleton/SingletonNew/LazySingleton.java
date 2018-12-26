package com.lakshmi.singleton.SingletonNew;

public class LazySingleton {
    private static  LazySingleton soleInstance = null; //Lazy loading

    private LazySingleton()
    {
    }


    public static LazySingleton getInstance()
    {
       if(soleInstance == null)
       {
           soleInstance = new LazySingleton();
       }
        return soleInstance;
    }

}
class  LazySingletonTest{

    public static void main(String[] args) {
        LazySingleton singleton1 = LazySingleton.getInstance();
        LazySingleton singleton2 = LazySingleton.getInstance();
        print("s1",singleton1);
        print("s2",singleton2);
    }
    static void print(String name, LazySingleton object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));
    }
}
