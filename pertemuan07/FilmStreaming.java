package pertemuan07;

class FilmStreaming extends Film {
    private String kualitasVideo;

    // Constructor
    public FilmStreaming(String judul, int durasi, String genre, double harga, String kualitasVideo) {
        super(judul, durasi, genre, harga);
        this.kualitasVideo = kualitasVideo;
    }

    // Overriding method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kualitas Video  : " + kualitasVideo);
        System.out.println("Kategori        : " + getKategori());
    }

    // Overriding method hitungHarga()
    @Override
    public double hitungHarga() {
        if (kualitasVideo.equalsIgnoreCase("HD")) {
            return harga + 10000;
        } else if (kualitasVideo.equalsIgnoreCase("4K")) {
            return harga + 20000;
        }
        return harga;
    }
}
