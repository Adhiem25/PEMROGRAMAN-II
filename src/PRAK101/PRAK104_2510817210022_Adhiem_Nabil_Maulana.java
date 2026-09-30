package PRAK101;

import java.util.Scanner;

public class PRAK104_2510817210022_Adhiem_Nabil_Maulana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu1 = input.next();
        String abu2 = input.next();
        String abu3 = input.next();

        System.out.print("Tangan Bagas: ");
        String bagas1 = input.next();
        String bagas2 = input.next();
        String bagas3 = input.next();

        int poin_abu = 0;
        int poin_bagas = 0;

        if (abu1.equals("B") && bagas1.equals("G") || abu1.equals("G") && bagas1.equals("K") || abu1.equals("K") && bagas1.equals("B")) {
            poin_abu++;
        } else if (!abu1.equals(bagas1)) {
            poin_bagas++;
        }

        if (abu2.equals("B") && bagas2.equals("G") || abu2.equals("G") && bagas2.equals("K") || abu2.equals("K") && bagas2.equals("B")) {
            poin_abu++;
        } else if (!abu2.equals(bagas2)) {
            poin_bagas++;
        }

        if (abu3.equals("B") && bagas3.equals("G") || abu3.equals("G") && bagas3.equals("K") || abu3.equals("K") && bagas3.equals("B")) {
            poin_abu++;
        } else if (!abu3.equals(bagas3)) {
            poin_bagas++;
        }

        if (poin_abu > poin_bagas) {
            System.out.println("Abu");
        } else if (poin_bagas > poin_abu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
