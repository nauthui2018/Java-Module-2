package geometrics;

public class Circle extends Shape {
    private double radius = 1;
    private String name = "Circle";

    public Circle() {
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.getRadius(), 2);
    }

    public double getPerimeter() {
        return Math.PI*this.getRadius()*2;
    }

    @Override
    public String toString() {
        return "A circle with radius= " +
                this.getRadius() +
                ", which is a subclass of " +
                super.toString();
    }
}
