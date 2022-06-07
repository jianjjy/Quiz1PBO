package Bangun3Dimensi;

import java.util.Scanner;

public class Kubus {
    public double s = 0;
    Scanner data = new Scanner(System.in);

    public void inputData ()
    {
        System.out.print ("Input Sisi = ");
        s = data.nextDouble();
    }

    public double hitungLuasKubus ()
    {
        return 6*s*s;
    }
    public double hitungVolumeKubus ()
    {
        return s * s * s;
    }
    public void tampilLuasKubus ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Sisi = " + s + "cm");
        System.out.println ("================================");
        System.out.println ("Luas = " + hitungLuasKubus() + "cm2");
    }
    public void tampilVolumeKubus ()
    {
        System.out.println ("--------------------------------");
        System.out.println ("Sisi = " + s + "cm");
        System.out.println ("================================");
        System.out.println ("Volume = " + hitungVolumeKubus() + "cm3");
    }
}
