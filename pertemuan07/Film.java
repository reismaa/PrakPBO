package pertemuan07;

class Film {
    protected String judul;
    protected int durasi;
    protected String genre;
    protected final double harga; // Final attribute: nilai tidak bisa diubah setelah diinisialisasi

    // Constructor
    public Film(String judul, int durasi, String genre, double harga) {
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
        this.harga = harga;
    }

    // Method tampilkanInfo
    public void tampilkanInfo() {
        System.out.println("Judul Film      : " + judul);
        System.out.println("Durasi          : " + durasi + " menit");
        System.out.println("Genre           : " + genre);
        System.out.println("Harga Dasar     : Rp " + harga);
    }

    // Overloading: method hitungHarga() tanpa parameter
    public double hitungHarga() {
        return harga;
    }

    // Overloading: method hitungHarga(int jumlah) dengan parameter[cite: 1]
    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    // Final method: tidak bisa di-override oleh subclass[cite: 1]
    public final String getKategori() {
        return "Film Umum";
    }
}
