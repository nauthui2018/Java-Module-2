package point2d.poind3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Point2D point = new Point2D(2,3);
        Point3D point1 = new Point3D(2,2,2);
        System.out.println(point.toString());
        System.out.println(point1.toString());
        System.out.println(Arrays.toString(point.getXY()));
        System.out.println(Arrays.toString(point1.getXYZ()));
    }
}
