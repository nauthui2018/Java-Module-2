package codegym.com;

public class TestStaticMethod {
    public static void main(String[] args) {
        Students.change();
        Students student1 = new Students(11, "Do Nguyen");
        Students student2 = new Students(12, "Vo Long");
        Students student3 = new Students(13, "Dai Hiep");
        student1.display();
        student2.display();
        student3.display();
    }
}
