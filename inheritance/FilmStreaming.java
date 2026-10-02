package inheritance;

public class FilmStreaming extends Film {
    String kualitasVideo;

    public FilmStreaming() {
        super();
    }

    public FilmStreaming(String judul, int durasi, String genre, String kualitasVideo) {
        super(judul, durasi, genre);
        this.kualitasVideo = kualitasVideo;
    }

    public void tampilkanInfoStreaming() {
        tampilkanInfo();
        System.out.println("Kualitas Video : " + kualitasVideo);
    }
}