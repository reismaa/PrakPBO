package jobsheet02;

public class Laptop {
    String merk;
    double ukuranLayar;
    String ram;
    String kapasitasPenyimpanan;
    int baterai;
    int volume;
    String statusLaptop;

    void menyalakan() {
        statusLaptop = "Menyala";
        System.out.println(merk + " berhasil dinyalakan.");
    }

    void mematikan() {
        statusLaptop = "Mati";
        System.out.println(merk + " berhasil dimatikan.");
    }

    void mengisiDaya() {
        baterai = 100;
        System.out.println("Baterai " + merk + " sedang diisi hingga " + baterai + "%.");
    }

    void menyimpanFIle(String namaFile) {
        System.out.println("File " + namaFile + " berhasil disimpan di " + merk + ".");
    }

    void mengaturVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume " + merk + " diatur menjadi " + volume + ".");
    }
    
}
