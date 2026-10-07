package PRAK201.PRAK202_2510817210022_Adhiem_Nabil_Maulana;

public class Kopi {

        public String namaKopi;
        public String ukuran;
        public double harga;
        private String pembeli;

        private static final double PAJAK = 0.11;

        public Kopi() {
        }

        public Kopi(String namaKopi, String ukuran, double harga) {
            this.namaKopi = namaKopi;
            this.ukuran = ukuran;
            this.harga = harga;
        }

        public void info() {
            System.out.println("Nama Kopi: " + namaKopi);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: Rp. " + harga);
        }

        public void setPembeli(String pembeli) {
            this.pembeli = pembeli;
        }

        public String getPembeli() {
            return pembeli;
        }

        public double getPajak() {
            return harga * PAJAK;
    }
}

