package geometric;

public class Circle extends Shape {
    private double radius = 1;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
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
