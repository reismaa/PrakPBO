package Praktikum08;


public class AbstractClassDemoFilm {
    public static void main(String[] args) {
        FilmBioskop bioskop1 = new FilmBioskop("Agak Laen", 119, "Komedi", 50000, 2);

        FilmStreaming streaming1 = new FilmStreaming("Jumbo", 102, "Animasi", 30000, "Full HD");

        System.out.println("=== FILM BIOSKOP ===");
        bioskop1.tampilkanInfo();
        System.out.println("\nHarga 2 tiket bioskop: Rp" + bioskop1.hitungHarga(2));

        System.out.println("\n=== FILM STREAMING ===");
        streaming1.tampilkanInfo();
        System.out.println("\nHarga 3 akses streaming: Rp" + streaming1.hitungHarga(3));
    }
}