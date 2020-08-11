package codegym.com;

public class Students {
    private int id;
    private String name;
    public static String college = "BBDIT";

    Students(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Students() {
    }

    static String change() {
        college = "CODEGYM";
        return college;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
