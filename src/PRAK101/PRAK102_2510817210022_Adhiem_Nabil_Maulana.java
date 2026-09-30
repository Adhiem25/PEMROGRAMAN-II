package PRAK101;

import java.util.Scanner;

public class PRAK102_2510817210022_Adhiem_Nabil_Maulana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal: ");
        int angka = input.nextInt();

        int i = 0;
        while (i <= 10) {
            if (angka % 5 == 0) {
                System.out.print(angka / 5 - 1);
            } else {
                System.out.print(angka);
            }

            if (i < 10) {
                System.out.print(", ");
            }

            angka++;
            i++;
        }
    }
}
