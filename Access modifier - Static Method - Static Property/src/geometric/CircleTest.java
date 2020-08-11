package geometric;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Radius: " + circle.getRadius());

        Circle circle1 = new Circle(2.5);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Radius: " + circle1.getRadius());
    }
}
