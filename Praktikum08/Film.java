package Praktikum08;


public abstract class Film {
    private String judul;
    private int durasi;
    private String genre;
    private final double harga;

    public Film(String judul, int durasi, String genre, double harga) {
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
        this.harga = harga;
    }

    public abstract void tampilkanInfo();
    public abstract double hitungHarga();

    public int hitungHarga(int jumlah) {
        return (int) (hitungHarga() * jumlah);
    }

    public final String getKategori() {
        return genre;
    }

    public String getJudul() {
        return judul;
    }

    public int getDurasi() {
        return durasi;
    }

    public String getGenre() {
        return genre;
    }

    public double getHarga() {
        return harga;
    }
}

