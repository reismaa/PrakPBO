package uts;

public class ClassB extends ClassA {
    private String valueB;


    public ClassB(int id, String name, String valueB) {
        super(id, name);
        this.valueB = valueB;
    }

    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ValueB : " + valueB);
    }
}
