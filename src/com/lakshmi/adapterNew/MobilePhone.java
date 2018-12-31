package com.lakshmi.adapterNew;

public class MobilePhone {
    public static void main(String args[])
    {
        new MobilePhone().chargeMe();
    }

    public void chargeMe()
    {
        Itarget adapter = new Adapter();
        Volt volt=adapter.get110Volt();
        System.out.println("Mobile phone is charging using : "+volt.getVolts() + "v");
    }
}

