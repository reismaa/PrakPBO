package jobsheet02;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Haruto Dirgantara";
        m2.alamat = "Malang, Jawa Timur";
        m2.kelas = "2C";

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Elina Bimantara";
        m3.alamat = "Bandung, Jawa Barat";
        m3.kelas = "2F";

        System.out.println("Biodata Mahasiswa 1");
        m1.displayBiodata();
        System.out.println("\nBiodata Mahasiswa 2");
        m2.displayBiodata();
        System.out.println("\nBiodata Mahasiswa 3");
        m3.displayBiodata();  
    }
    
}
