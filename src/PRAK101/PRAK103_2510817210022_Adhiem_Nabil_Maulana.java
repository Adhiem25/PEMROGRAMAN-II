package PRAK101;

import java.util.Scanner;

public class PRAK103_2510817210022_Adhiem_Nabil_Maulana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        System.out.print("Masukkan bilangan awal: ");
        int angka = input.nextInt();

        int jumlah = 0;
        do {
            if (angka % 2 != 0) {
                if (jumlah > 0) {
                    System.out.print(", ");
                }
                System.out.print(angka);
                jumlah++;
            }
            angka++;
        } while (jumlah < n);
    }
}