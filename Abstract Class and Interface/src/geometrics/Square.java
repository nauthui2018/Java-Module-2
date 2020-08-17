package geometrics;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(String color, boolean filled) {
        super(color, filled);
    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A square with side= " +
                this.getSide() +
                ", which is a subclass of " +
                super.toString();
    }
}
