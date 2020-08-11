package geometric;

public class Circle {
    private double radius = 1;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }
}
