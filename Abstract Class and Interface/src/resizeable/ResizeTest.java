package resizeable;

import geometrics.Circle;

public class ResizeTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(2);
        circles[2] = new Circle(3);

        System.out.println("Before resize:");
        for (int i=0; i< circles.length; i++) {
            int index = i+1;
            System.out.println("Circle " + index + ":" + circles[i].getArea());
        }
        ResizeCircle resizeCircle = new ResizeCircle();
        System.out.println("After resize:");
        for (int i=0; i< circles.length; i++) {
            int index = i+1;
            double percent = (Math.random()*100)/100;
            System.out.println("Increase " + percent + "%");
            resizeCircle.resize(percent, circles[i]);
            System.out.println("Circle " + index + ":" + circles[i].getArea());
        }
    }
}
