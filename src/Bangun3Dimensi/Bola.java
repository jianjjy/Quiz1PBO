package Bangun3Dimensi;

import java.util.Scanner;

public class Bola {
    public double jari = 0;
    public final double pi = 22.0/7;
    Scanner data = new Scanner(System.in);

    public void inputData ()
    {
        System.out.print ("Input Jari = ");
        jari = data.nextDouble();
    }

    public double hitungVolumeBola ()
    {
        return 4/3 * pi * Math.pow(jari,3);
    }

    public double hitungLuasBola ()
    {
        return 4 * pi * Math.pow(jari,2);
    }
    
    public void tampilLuasBola ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasBola() + "cm2");
    }
    
    public void tampilVolumeBola ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeBola () + "cm3");
    }
}
