package Praktikum08;

public class FilmBioskop extends Film {
    private int nomorStudio;

    public FilmBioskop(String judul, int durasi, String genre, double harga, int nomorStudio) {
        super(judul, durasi, genre, harga);
        this.nomorStudio = nomorStudio;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis       : Film Bioskop");
        System.out.println("Judul       : " + getJudul());
        System.out.println("Durasi      : " + getDurasi() + " menit");
        System.out.println("Genre       : " + getGenre());
        System.out.println("Nomor Studio: " + nomorStudio);
        System.out.println("Harga       : Rp" + hitungHarga());
        System.out.println("Kategori    : " + getKategori());
    }

    @Override
    public double hitungHarga() {
        return getHarga();
    }
}
