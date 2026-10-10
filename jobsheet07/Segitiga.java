package jobsheet07;

public class Segitiga {
    private int sudut;

    // Overloading 1: satu parameter
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    // Overloading 2: dua parameter
    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Overloading 3: tiga parameter
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Overloading 4: dua parameter
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt(
            Math.pow(sisiA, 2) + Math.pow(sisiB, 2)
        );
    }

    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Sisa sudut: "
            + s.totalSudut(60));

        System.out.println("Sisa sudut: "
            + s.totalSudut(60, 70));

        System.out.println("Keliling segitiga: "
            + s.keliling(3, 4, 5));

        System.out.println("Sisi miring: "
            + s.keliling(3, 4));
    }
}