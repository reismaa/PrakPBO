package Praktikum08;

public class FilmStreaming extends Film {
    private String kualitasVideo;

    public FilmStreaming(String judul, int durasi, String genre, double harga, String kualitasVideo) {
        super(judul, durasi, genre, harga);
        this.kualitasVideo = kualitasVideo;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis         : Film Streaming");
        System.out.println("Judul         : " + getJudul());
        System.out.println("Durasi        : " + getDurasi() + " menit");
        System.out.println("Genre         : " + getGenre());
        System.out.println("Kualitas Video: " + kualitasVideo);
        System.out.println("Harga         : Rp" + hitungHarga());
        System.out.println("Kategori      : " + getKategori());
    }

    @Override
    public double hitungHarga() {
        return getHarga();
    }
}