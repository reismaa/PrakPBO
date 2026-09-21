package tugasjobsheet04;

public class BioskopDemo {

    public static void main(String[] args) {

        Pelanggan pelanggan1 = new Pelanggan("PL001", "Reilyna", "081234567890");

        Petugas petugas1 = new Petugas("PT001", "Andi", "Petugas Loket");

        Tiket tiket1 = new Tiket("TK001", "Avengers: Endgame", "Studio 1", 50000, pelanggan1, petugas1);

        Tiket tiket2 = new Tiket("TK002", "How to Train Your Dragon", "Studio 2", 45000, pelanggan1, petugas1);

        pelanggan1.tambahTiket(tiket1);
        pelanggan1.tambahTiket(tiket2);

        System.out.println("========== DATA PELANGGAN ==========");
        pelanggan1.tampilkanData();

        System.out.println("\n========== DATA PETUGAS ==========");
        petugas1.tampilkanData();

        System.out.println("\n========== DAFTAR TIKET ==========");
        pelanggan1.tampilkanTiket();

        System.out.println("\n========== PROSES TIKET ==========");
        petugas1.prosesTiket(tiket1);

        System.out.println("\n========== CETAK TIKET ==========");
        petugas1.cetakTiket(tiket1);
    }
}
