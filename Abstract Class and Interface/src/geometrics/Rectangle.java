package geometrics;

public class Rectangle extends Shape {
    private String name = "Rectangle";
    private double width = 1;
    private double length = 1;

    public Rectangle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.getLength()*this.getWidth();
    }

    public double getPerimeter() {
        return (this.getLength()+this.getWidth())*2;
    }

    @Override
    public String toString() {
        return "A rectangle with width= " +
                this.getWidth() +
                " and length= " +
                this.getLength() +
                ", which is a subclass of " +
                super.toString();
    }
}
