package jobsheet07;

public class Main {
    public static void main(String[] args) {
        Manusia m;

        m = new Dosen();
        m.bernafas();
        m.makan();

        m = new Mahasiswa();
        m.bernafas();
        m.makan();

        Dosen d = new Dosen();
        d.lembur();

        Mahasiswa s = new Mahasiswa();
        s.tidur();
    }
}
