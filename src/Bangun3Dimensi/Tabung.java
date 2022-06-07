package Bangun3Dimensi;

import java.util.Scanner;

public class Tabung {
    public double tinggi, jari;
    final double pi = (double) 22/7;
    Scanner data = new Scanner(System.in);

    public void inputData ()
    {
        System.out.print ("Input Tinggi = ");
        tinggi = data.nextDouble();
        System.out.print ("Input Jari = ");
        jari = data.nextDouble();
    }

    public double hitungVolumeTabung ()
    {
        return pi * Math.pow(jari,2) * tinggi;
    }

    public double hitungLuasTabung ()
    {
        return 2 * pi * jari * (jari + tinggi);
    }
    
    public void tampilLuasTabung ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasTabung() + "cm2");
    }
    
    public void tampilVolumeTabung ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeTabung () + "cm3");
    }
}
