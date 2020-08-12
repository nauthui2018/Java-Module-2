package point.movablePoint;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(2,2);
        MovablePoint point1 = new MovablePoint(point.getX(), point.getY(),1,1);
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(point.toString());
        System.out.println(Arrays.toString(point1.getSpeed()));
        System.out.println(point1.toString());
        point1.move();
        System.out.println(point1.toString());
        point1.move();
        System.out.println(point1.toString());

    }
}
