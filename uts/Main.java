package uts;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Objek Class B ===");
        ClassB objekB = new ClassB(1, "Data B", "Nilai B");
        objekB.tampilkanInfo();

        System.out.println("\n=== Objek Class C ===");
        ClassC objekC = new ClassC(2, "Data C", "Nilai C");
        objekC.tampilkanInfo();

        System.out.println("\n=== Objek Class D ===");
        ClassD objekD = new ClassD(3, "Data D", "Nilai B", "Nilai D");
        objekD.tampilkanInfo();
    }
}
