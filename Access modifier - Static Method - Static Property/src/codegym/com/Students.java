package codegym.com;

public class Students {
    private int id;
    private String name;
    private static String college = "BBDIT";

    Students(int id, String name){
        this.id = id;
        this.name = name;
    }

    static void change() {
        college = "CODEGYM";
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }
}
