package Bangun3Dimensi;

import java.util.Scanner;

public class Kerucut {
    private double jari;
    private double tinggi;
    private double pelukis;
    final double pi = (22.0/7);
    double volume;
    double luas;
    Scanner data = new Scanner(System.in);


    public Kerucut() {
        this.jari = 0;
        this.tinggi = 0;
    }

    public Kerucut(double jari, double tinggi) {
        this.jari = jari;
        this.tinggi = tinggi;
    }


    public double getJari() {
        return this.jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return this.volume;
    }


    public double getLuas() {
        return this.luas;
    }



    public double hitungVolumeKerucut ()
    {
        volume = 1.0/3 * pi * Math.pow(jari, 2) * tinggi;
        return volume;
    }

    public double hitungLuasKerucut ()
    {
        pelukis = Math.sqrt(Math.pow(tinggi, 2)+Math.pow(jari, 2));
        luas = pi * jari * (pelukis + jari);
        return luas;
    }
    
    public void tampilLuasKerucut ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("Pelukis = " + pelukis + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasKerucut() + "cm2");
    }

    public void tampilVolumeKerucut ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Jari = " + jari + "cm");
        System.out.println ("Tinggi = " + tinggi + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeKerucut () + "cm3");
    }
}
