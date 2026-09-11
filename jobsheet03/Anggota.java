
package jobsheet03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private double limitPinjaman;
    private double jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, double limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public double getLimitPinjaman() {
        return limitPinjaman;
    }

    public double getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(double nominal) {
        if (nominal <= 0) {
            System.out.println("Nominal pinjaman harus lebih dari 0");
        } else if (jumlahPinjaman + nominal <= limitPinjaman) {
            jumlahPinjaman += nominal;
            System.out.println("Pinjaman berhasil ditambahkan");
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }
    }

    
    public void angsur(double nominal) {
        if (nominal < jumlahPinjaman * 0.10) {
            System.out.println(
                "Maaf, angsuran harus 10% dari jumlah pinjaman"
            );
        } else {
            jumlahPinjaman -= nominal;
        }
    }
}
