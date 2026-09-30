package PRAK101;

import java.time.format.TextStyle;
import java.util.Scanner;
import java.time.Month;
import java.util.Locale;

public class PRAK101_2510817210022_Adhiem_Nabil_Maulana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempat_lahir = input.nextLine();

        int bulan_lahir;
        do {
            System.out.print("Masukkan Bulan Lahir (1-12): ");
            bulan_lahir = input.nextInt();
            if (bulan_lahir < 1 || bulan_lahir > 12) {
                System.out.println("Bulan tidak valid! Masukkan angka 1 sampai 12.");
            }
        } while (bulan_lahir < 1 || bulan_lahir > 12);

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun_lahir = input.nextInt();

        int hariMaks;
        switch (bulan_lahir) {
            case 4: case 6: case 9: case 11:
                hariMaks = 30;
                break;
            case 2:
                boolean kabisat = (tahun_lahir % 4 == 0 && tahun_lahir % 100 != 0) || (tahun_lahir % 400 == 0);
                hariMaks = kabisat ? 29 : 28;
                break;
            default:
                hariMaks = 31;
        }

        int tanggal_lahir;
        do {
            System.out.print("Masukkan Tanggal Lahir (1-" + hariMaks + "): ");
            tanggal_lahir = input.nextInt();
            if (tanggal_lahir < 1 || tanggal_lahir > hariMaks) {
                System.out.println("Tanggal tidak valid untuk bulan ini! Masukkan angka 1 sampai " + hariMaks + ".");
            }
        } while (tanggal_lahir < 1 || tanggal_lahir > hariMaks);

        String namaBulan = Month.of(bulan_lahir)
                .getDisplayName(TextStyle.FULL, new Locale("id", "ID"));

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi_badan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double berat_badan = input.nextDouble();

        System.out.println("Nama Lengkap " + nama + " Lahir di " + tempat_lahir + " pada Tanggal " + tanggal_lahir + " " + namaBulan + " " + tahun_lahir + "\nTinggi Badan "
                + tinggi_badan + " cm " + " dan Berat Badan " + berat_badan + " kilogram");
        input.close();
    }
}