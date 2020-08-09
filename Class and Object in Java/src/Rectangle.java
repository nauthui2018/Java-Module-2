public class Rectangle {
    double width, length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return this.width*this.length;
    }

    public double getPerimeter() {
        return 2*(this.length+this.width);
    }

    public String display() {
        return "Rectangle { width:" + this.width + ", length:" + this.length + " }";
    }
}

