package PRAK101;

import java.util.Scanner;

public class PRAK105_2510817210022_Adhiem_Nabil_Maulana {
    static final double PHI = 3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double jari_jari = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume = PHI * jari_jari * jari_jari * tinggi;
        volume = Math.round(volume * 1000) / 1000.0;

        System.out.println("Volume tabung dengan jari-jari " + jari_jari + " cm dan tinggi " + tinggi + " cm adalah " + volume + " m3");
    }
}