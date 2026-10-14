package PRAK301.SOAL2;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin,
                  int tanggal, int bulan, int tahun) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggal;
        this.bulanKemerdekaan = bulan;
        this.tahunKemerdekaan = tahun;
    }

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin) {
        this(nama, jenisKepemimpinan, namaPemimpin, 0, 0, 0);
    }

    public String getNama() { return nama; }
    public String getJenisKepemimpinan() { return jenisKepemimpinan; }
    public String getNamaPemimpin() { return namaPemimpin; }
    public int getTanggalKemerdekaan() { return tanggalKemerdekaan; }
    public int getBulanKemerdekaan() { return bulanKemerdekaan; }
    public int getTahunKemerdekaan() { return tahunKemerdekaan; }

    public boolean isMonarki() {
        return jenisKepemimpinan.equalsIgnoreCase("monarki");
    }

    public String getSebutanPemimpin() {
        if (isMonarki()) return "Raja";
        if (jenisKepemimpinan.equalsIgnoreCase("presiden")) return "Presiden";
        return "Perdana Menteri";
    }
}