package com.lakshmi.singleton.SingletonNew;

 class SingletonClone implements Cloneable {


     public Object clone() throws CloneNotSupportedException
     {
         return super.clone();
     }


    private static  SingletonClone soleInstance = new SingletonClone();

    private SingletonClone()
    {
    }

    public static SingletonClone getInstance()
    {

        return soleInstance;
    }
}

class  TestSingletonClone{

    public static void main(String[] args) throws CloneNotSupportedException {

        SingletonClone singleton1 = SingletonClone.getInstance();
        SingletonClone singleton2 = SingletonClone.getInstance();
         print("s1",singleton1);
         print("s2",singleton2);
         SingletonClone singleton3 = (SingletonClone) singleton1.clone();
         print("s3",singleton3);
    }
    static void print(String name, SingletonClone object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));
    }

}