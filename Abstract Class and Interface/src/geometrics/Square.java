package geometrics;

import colorable.Colorable;

public class Square extends Rectangle implements Colorable<Square> {
    private String name = "Square";

    public Square() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
