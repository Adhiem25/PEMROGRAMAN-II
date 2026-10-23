package PRAK401.SOAL2;

import java.util.Scanner;

public class MainSoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = Integer.parseInt(sc.nextLine());

        System.out.print("Nama hewan peliharaan: ");
        String nama = sc.nextLine();
        System.out.print("Ras: ");
        String ras = sc.nextLine();
        System.out.print("Warna Bulu: ");
        String warna = sc.nextLine();

        if (pilihan == 1) {
            Kucing kucing = new Kucing(ras, nama, warna);
            kucing.displayDetailKucing();
        } else if (pilihan == 2) {
            System.out.print("Kemampuan : ");
            String[] kemampuan = sc.nextLine().split("\\s*,\\s*");
            Anjing anjing = new Anjing(nama, ras, warna, kemampuan);
            anjing.displayDetailAnjing();
        }

        sc.close();
    }
}