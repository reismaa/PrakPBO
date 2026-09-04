package jobsheet02;

public class LaptopDemo {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.merk = "Asus";
        laptop1.ukuranLayar = 14.0;
        laptop1.ram = "8 GB";
        laptop1.kapasitasPenyimpanan = "512 GB SSD";
        laptop1.baterai = 70;
        laptop1.volume = 50;
        laptop1.statusLaptop = "Mati";

        Laptop laptop2 = new Laptop();
        laptop2.merk = "Lenovo";
        laptop2.ukuranLayar = 15.6;
        laptop2.ram = "16 GB";
        laptop2.kapasitasPenyimpanan = "1 TB SSD";
        laptop2.baterai = 80;
        laptop2.volume = 60;
        laptop2.statusLaptop = "Mati";

        // Update atribut laptop1 & laptop2
        laptop1.ram = "16 GB";
        laptop1.baterai = 90;
        laptop1.volume = 70;

        laptop2.kapasitasPenyimpanan = "2 TB SSD";
        laptop2.baterai = 95;
        laptop2.volume = 80;

        // Menampilkan informasi laptop1
        System.out.println("Informasi Laptop 1:");
        System.out.println("Merk                    : " + laptop1.merk);
        System.out.println("Ukuran Layar            : " + laptop1.ukuranLayar + " inci");
        System.out.println("RAM                     : " + laptop1.ram);
        System.out.println("Kapasitas Penyimpanan   : " + laptop1.kapasitasPenyimpanan);
        System.out.println("Baterai                 : " + laptop1.baterai + "%");
        System.out.println("Volume                  : " + laptop1.volume);
        System.out.println("Status                  : " + laptop1.statusLaptop);

        laptop1.menyalakan();
        laptop1.mengisiDaya();
        laptop1.mengaturVolume(75);
        laptop1.menyimpanFIle("TugasPBO.pdf");

        // Menampilkan informasi laptop2
        System.out.println("\nInformasi Laptop 2:");
        System.out.println("Merk                    : " + laptop2.merk);
        System.out.println("Ukuran Layar            : " + laptop2.ukuranLayar + " inci");
        System.out.println("RAM                     : " + laptop2.ram);
        System.out.println("Kapasitas Penyimpanan   : " + laptop2.kapasitasPenyimpanan);
        System.out.println("Baterai                 : " + laptop2.baterai + "%");
        System.out.println("Volume                  : " + laptop2.volume);
        System.out.println("Status                  : " + laptop2.statusLaptop);

        laptop2.menyalakan();
        laptop2.mengisiDaya();
        laptop2.mengaturVolume(85);
        laptop2.menyimpanFIle("LaporanPraktikum.docx");

    }
}
