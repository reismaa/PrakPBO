package inheritance;

public class FilmBioskop extends Film {
    int nomorStudio;

    public FilmBioskop() {
        super();
    }

    public FilmBioskop(String judul, int durasi, String genre, int nomorStudio) {
        super(judul, durasi, genre);
        this.nomorStudio = nomorStudio;
    }

    public void tampilkanInfoBioskop() {
        tampilkanInfo();
        System.out.println("Nomor Studio : " + nomorStudio);
    }
}