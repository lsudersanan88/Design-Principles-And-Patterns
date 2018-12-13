package com.lakshmi.singleton;

 class Singleton {

    private static  Singleton instance = null;
    private Singleton()
    {
         //Prevent form the reflection api.
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
    }



    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

}
class Test{
    public synchronized static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        //Instance 2
        Singleton instance2 = Singleton.getInstance();

        //now lets check the hash key.
        System.out.println("Instance 1 hash:" + instance1.hashCode());
        System.out.println("Instance 2 hash:" + instance2.hashCode());
    }

}