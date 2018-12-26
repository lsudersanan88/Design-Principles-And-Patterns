package com.lakshmi.singleton.SingletonNew;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SingletonMultiThreading {

    private static volatile   SingletonMultiThreading soleInstance = null;

    private SingletonMultiThreading()
    {

    }


  /*  public static SingletonMultiThreading getInstance()
    {
        if(soleInstance == null)
        {
            soleInstance = new SingletonMultiThreading();
        }
        return soleInstance;
    }*/


   /* public static synchronized SingletonMultiThreading getInstance()
    {
        if(soleInstance == null)
        {
            soleInstance = new SingletonMultiThreading();
        }
        return soleInstance;
    }*/

     public static  SingletonMultiThreading getInstance()
    {
        if(soleInstance == null)
        {
            synchronized (SingletonMultiThreading.class) // check after lock too
                                                         // double check locking
            {
                if(soleInstance == null)
                {
                    soleInstance = new SingletonMultiThreading();
                }
            }
        }
        return soleInstance;
    }



}

class SingletonMultiThreadingTest{

    static  void useSingleton()
    {
        SingletonMultiThreading singletonMultiThreading = SingletonMultiThreading.getInstance();
        print("singletonMultiThreading",singletonMultiThreading);
    }
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(7);
        executorService.submit(SingletonMultiThreadingTest::useSingleton);
        executorService.submit(SingletonMultiThreadingTest::useSingleton);
        executorService.submit(SingletonMultiThreadingTest::useSingleton);
        executorService.submit(SingletonMultiThreadingTest::useSingleton);
        executorService.submit(SingletonMultiThreadingTest::useSingleton);
        executorService.submit(SingletonMultiThreadingTest::useSingleton);
        executorService.shutdown();

    }
    static void print(String name, SingletonMultiThreading object)
    {
        System.out.println(String.format("Object: %s, Hashcode:%d", name ,object.hashCode()));
        //Object: singletonMultiThreading, Hashcode:2107224694
        //Object: singletonMultiThreading, Hashcode:1868461356
    }

}