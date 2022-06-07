package Bangun3Dimensi;

import java.util.Scanner;

public class Balok {
    public double tinggi;
    public double lebar;
    public double panjang;
    Scanner data = new Scanner(System.in);

    public void inputData ()
    {
        System.out.print ("Input Tinggi = ");
        tinggi = data.nextDouble();
        System.out.print ("Input Lebar = ");
        lebar = data.nextDouble();
        System.out.print ("Input Panjang = ");
        panjang = data.nextDouble();
    }

    public double hitungVolumeBalok ()
    {
        return lebar * tinggi * panjang;
    }

    public double hitungLuasBalok ()
    {
        return (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * tinggi * lebar);
    }
    
    public void tampilLuasBalok ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("Lebar = " + lebar + "cm");
        System.out.println ("Panjang = " + panjang + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasBalok() + "cm2");
    }
    
    public void tampilVolumeBalok ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("Lebar = " + lebar + "cm");
        System.out.println ("Panjang = " + panjang + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeBalok () + "cm3");
    }
}
