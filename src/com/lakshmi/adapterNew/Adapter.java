package com.lakshmi.adapterNew;

public class Adapter implements Itarget
{

    private ElectricSocket electricSocket = new ElectricSocket();

    @Override
    public Volt get110Volt()
    {
        Volt volt = electricSocket.getVolt();
        System.out.println("From ElectricSocket MobilePhoneCharger got :" + volt.getVolts() + "v");
        Volt convertedVolt = convertVolt(volt, 2);
        System.out.println("\nMobilePhoneCharger converterd " + volt.getVolts() + "v to " + convertedVolt.getVolts() + "v\n");
        return convertedVolt;
    }

    private Volt convertVolt(Volt v, int i)
    {
        return new Volt(v.getVolts() / i);
    }
}