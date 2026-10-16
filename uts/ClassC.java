package uts;

public class ClassC extends ClassA {
    private String valueC;

    public ClassC(int id, String name, String valueC) {
        super(id, name);
        this.valueC = valueC;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ValueC : " + valueC);
    }
}
