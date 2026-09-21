package tugasjobsheet04;

public class Petugas {
    private String idPetugas;
    private String nama;
    private String jabatan;

    public Petugas(String idPetugas, String nama, String jabatan) {
        this.idPetugas = idPetugas;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Method tampilkan data
    public void tampilkanData() {
        System.out.println("ID Petugas : " + idPetugas);
        System.out.println("Nama       : " + nama);
        System.out.println("Jabatan    : " + jabatan);
    }

    // Method proses tiket
    public void prosesTiket(Tiket tiket) {
        tiket.ubahStatus("Diproses");
        System.out.println(
            "Tiket " + tiket.getIdTiket() + " sedang diproses oleh " + nama
        );
    }

    // Method cetak tiket
    public void cetakTiket(Tiket tiket) {
        System.out.println("\n========== TIKET BIOSKOP ==========");
        tiket.tampilkanInfo();
        System.out.println("Dicetak oleh : " + nama);
        System.out.println("===================================");
    }
}