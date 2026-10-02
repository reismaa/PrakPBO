package inheritance;

public class Film {
    protected String judul;
    protected int durasi;
    protected String genre;

    public Film() {

    }

    public Film(String judul, int durasi, String genre) {
        this.judul = judul;
        this.durasi = durasi;
        this.genre = genre;
    }

    public void tampilkanInfo() {
        System.out.println("Judul  : " + judul);
        System.out.println("Durasi : " + durasi + " menit");
        System.out.println("Genre  : " + genre);
    }
}
