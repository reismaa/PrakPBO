package pertemuan07;

public class FilmDemo {
    public static void main(String[] args) {
        System.out.println("=== INFORMASI FILM BIOSKOP ===");
        FilmBioskop bioskop = new FilmBioskop("Avengers: Endgame", 181, "Action", 40000, 2);
        bioskop.tampilkanInfo();
        System.out.println("Total Harga (Overriding): Rp " + bioskop.hitungHarga());
        System.out.println("Total Harga untuk 3 Tiket (Overloading): Rp " + bioskop.hitungHarga(3));

        System.out.println("\n-----------------------------------\n");

        System.out.println("=== INFORMASI FILM STREAMING ===");
        FilmStreaming streaming = new FilmStreaming("Stranger Things", 60, "Sci-Fi", 30000, "4K");
        streaming.tampilkanInfo();
        System.out.println("Total Harga (Overriding): Rp " + streaming.hitungHarga());
        System.out.println("Total Harga untuk 2 Akun (Overloading): Rp " + streaming.hitungHarga(2));
    }
    
}
