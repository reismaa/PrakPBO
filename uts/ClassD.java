package uts;

public class ClassD extends ClassB {
    private String valueD;

    public ClassD(int id, String name, String valueB, String valueD) {
        super(id, name, valueB);
        this.valueD = valueD;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ValueD : " + valueD);
    }
}
