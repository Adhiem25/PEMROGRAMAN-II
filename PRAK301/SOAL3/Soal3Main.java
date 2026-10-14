package PRAK301.SOAL3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Soal3Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Mahasiswa> daftar = new ArrayList<>();
        HashMap<String, Mahasiswa> indeksNim = new HashMap<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            try {
                pilihan = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                pilihan = -1;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine().trim();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine().trim();
                    if (indeksNim.containsKey(nim)) {
                        System.out.println("NIM " + nim + " sudah terdaftar.");
                    } else {
                        Mahasiswa m = new Mahasiswa(nama, nim);
                        daftar.add(m);
                        indeksNim.put(nim, m);
                        System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = input.nextLine().trim();
                    Mahasiswa target = indeksNim.remove(nimHapus);
                    if (target != null) {
                        daftar.remove(target);
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimCari = input.nextLine().trim();
                    Mahasiswa ketemu = indeksNim.get(nimCari);
                    if (ketemu != null) {
                        System.out.println("NIM: " + ketemu.getNim() + ", Nama: " + ketemu.getNama());
                    } else {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }
                    break;
                case 4:
                    if (daftar.isEmpty()) {
                        System.out.println("Daftar mahasiswa masih kosong.");
                    } else {
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa m : daftar) {
                            System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        input.close();
    }
}