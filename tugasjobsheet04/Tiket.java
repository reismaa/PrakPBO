package tugasjobsheet04;

public class Tiket {
    private String idTiket;
    private String namaFilm;
    private String studio;
    private double harga;
    private String status;

    private Pelanggan pelanggan;
    private Petugas petugas;

    public Tiket(
            String idTiket,
            String namaFilm,
            String studio,
            double harga,
            Pelanggan pelanggan,
            Petugas petugas) {

        this.idTiket = idTiket;
        this.namaFilm = namaFilm;
        this.studio = studio;
        this.harga = harga;
        this.status = "Menunggu";
        this.pelanggan = pelanggan;
        this.petugas = petugas;
    }

    public String getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(String idTiket) {
        this.idTiket = idTiket;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    // Method hitung harga
    public double hitungHarga() {
        return harga;
    }

    // Method ubah status
    public void ubahStatus(String status) {
        this.status = status;
    }

    // Method tampilkan informasi
    public void tampilkanInfo() {
        System.out.println("ID Tiket    : " + idTiket);
        System.out.println("Film        : " + namaFilm);
        System.out.println("Studio      : " + studio);
        System.out.println("Harga       : Rp" + String.format("%.0f", hitungHarga()));
        System.out.println("Status      : " + status);

        if (pelanggan != null) {
            System.out.println("Pelanggan   : " + pelanggan.getNama());
        }

        if (petugas != null) {
            System.out.println("Petugas     : " + petugas.getNama());
        }
    }
}
