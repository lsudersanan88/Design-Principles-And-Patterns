package com.lakshmi.singleton.SingletonNew;

import java.io.*;

public class SingletonSerialization implements Serializable{
    private static SingletonSerialization soleInstance = new SingletonSerialization();

    private SingletonSerialization() {
    }

    public static SingletonSerialization getInstance() {

        return soleInstance;
    }


}

class TestSingletonSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SingletonSerialization singleton1 = SingletonSerialization.getInstance();
        SingletonSerialization singleton2 = SingletonSerialization.getInstance();
        print("s1", singleton1);
        print("s2", singleton2);
        

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("/tmp/s2.ser"));
        objectOutputStream.writeObject(singleton2);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/tmp/s2.ser"));
        SingletonSerialization singleton3 = (SingletonSerialization) objectInputStream.readObject();
        print("s3", singleton3);

    }

    static void print(String name, SingletonSerialization object) {
        System.out.println(String.format("Object: %s, Hashcode:%d", name, object.hashCode()));
    }

}