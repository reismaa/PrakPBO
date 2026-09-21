package tugasjobsheet04;

import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noHp;
    private ArrayList<Tiket> daftarTiket;

    public Pelanggan(String idPelanggan, String nama, String noHp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHp = noHp;
        this.daftarTiket = new ArrayList<>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public ArrayList<Tiket> getDaftarTiket() {
        return daftarTiket;
    }

    // Method tambah tiket
    public void tambahTiket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    // Method tampilkan tiket
    public void tampilkanTiket() {
        System.out.println("Daftar Tiket:");

        if (daftarTiket.isEmpty()) {
            System.out.println("Belum ada tiket.");
        } else {
            for (Tiket tiket : daftarTiket) {
                tiket.tampilkanInfo();
                System.out.println();
            }
        }
    }

    // Method tampilkan data pelanggan
    public void tampilkanData() {
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
        System.out.println("No. HP       : " + noHp);
    }
}