package circle.cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "yellow");
        Cylinder cylinder = new Cylinder(5);
        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());
        System.out.println("Volume of cylinder: " + cylinder.getVolume());
    }
}
