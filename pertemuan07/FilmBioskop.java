package pertemuan07;

class FilmBioskop extends Film {
    private int nomorStudio;

    // Cunstructor
    public FilmBioskop(String judul, int durasi, String genre, double harga, int nomorStudio) {
        super(judul, durasi, genre, harga);
        this.nomorStudio = nomorStudio;
    }

    // Overriding method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nomor Studio    : Studio " + nomorStudio);
        System.out.println("Kategori        : " + getKategori());
    }

    // Overriding method hitungHarga()
    @Override
    public double hitungHarga() {
        return harga + 10000;
    }
}
