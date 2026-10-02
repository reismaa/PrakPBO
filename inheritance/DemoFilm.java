package inheritance;

public class DemoFilm {
    public static void main(String[] args) {

        FilmBioskop film1 = new FilmBioskop("Agak Laen (2024)", 119, "Horror Komedi", 3);
        FilmStreaming film2 = new FilmStreaming("Gadis Kretek", 74, "Sejarah Romantis", "Full HD");

        System.out.println("=== FILM BIOSKOP ===");
        film1.tampilkanInfoBioskop();

        System.out.println("\n=== FILM STREAMING ===");
        film2.tampilkanInfoStreaming();

        // Modifikasi Film Bioskop
        film1.judul = "Sekawan Limo 2";
        film1.durasi = 122;
        film1.genre = "Horror Komedi";
        film1.nomorStudio = 5;

        // Modifikasi Film Streaming
        film2.judul = "Wednesday";
        film2.durasi = 60;
        film2.genre = "Drama Misteri";
        film2.kualitasVideo = "4K Ultra HD";

        System.out.println("\n=== FILM BIOSKOP (Setelah Modifikasi) ===");
        film1.tampilkanInfoBioskop();

        System.out.println("\n=== FILM STREAMING (Setelah Modifikasi) ===");
        film2.tampilkanInfoStreaming();

    }
}
