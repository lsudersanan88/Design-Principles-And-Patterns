package com.lakshmi.singleton.SingletonNew;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class HolderForMultiThreading {

    private static volatile   HolderForMultiThreading soleInstance = null;

    private HolderForMultiThreading()
    {

    }

    static class Holder
    {
        static final HolderForMultiThreading INSTANCE = new HolderForMultiThreading();
    }

     public static  HolderForMultiThreading getInstance()
    {
        return Holder.INSTANCE;
    }

}

class HolderForMultiThreadingTest{


    static  void useSingleton1()
    {
        HolderForMultiThreading singletonMultiThreading = HolderForMultiThreading.getInstance();
        print("singletonMultiThreading",singletonMultiThreading);
    }
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(HolderForMultiThreadingTest::useSingleton1);
        executorService.submit(HolderForMultiThreadingTest::useSingleton1);
        executorService.shutdown();

    }
    static void print(String name, HolderForMultiThreading object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));

    }

}