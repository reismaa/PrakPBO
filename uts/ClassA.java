package uts;

public class ClassA {
    private int id;
    private String name;

    public ClassA(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void tampilkanInfo() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }
}
