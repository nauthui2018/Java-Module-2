package comparable;

import geometrics.Circle;

public class ComparableCircle extends Circle implements Comparable {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo() {
        return 0;
    }

    @Override
    public int compareTo(ComparableCircle n) {
        if (getRadius() > n.getRadius()) {
            return 1;
        } else if (getRadius() < n.getRadius()) {
            return -1;
        } else {
            return 1;
        }
    }
}
