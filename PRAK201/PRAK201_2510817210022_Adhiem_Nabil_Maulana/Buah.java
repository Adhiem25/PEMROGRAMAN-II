package PRAK201.PRAK201_2510817210022_Adhiem_Nabil_Maulana;

import java.util.Locale;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlahBeli;

    private static final double BERAT_PAKET = 4;
    private static final double DISKON_PAKET = 0.02;

    public Buah(String nama, double berat, double harga, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public String getNama() { return nama; }
    public double getBerat() { return berat; }
    public double getHarga() { return harga; }
    public double getJumlahBeli() { return jumlahBeli; }
    public void setJumlahBeli(double jumlahBeli) { this.jumlahBeli = jumlahBeli; }

    private double hitungHargaPaket() {
        return (BERAT_PAKET / berat) * harga;
    }

    public double hitungHargaSebelumDiskon() {
        return (jumlahBeli / berat) * harga;
    }

    public double hitungTotalDiskon() {
        int jumlahPaket = (int) (jumlahBeli / BERAT_PAKET);
        double totalDiskon = 0;

        for (int i = 0; i < jumlahPaket; i++) {
            totalDiskon += hitungHargaPaket() * DISKON_PAKET;
        }
        return totalDiskon;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanInfo() {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.println(String.format(Locale.US, "Harga Sebelum Diskon: Rp%.2f", hitungHargaSebelumDiskon()));
        System.out.println(String.format(Locale.US, "Total Diskon: Rp%.2f", hitungTotalDiskon()));
        System.out.println(String.format(Locale.US, "Harga Setelah Diskon: Rp%.2f", hitungHargaSetelahDiskon()));
        System.out.println();
    }
}