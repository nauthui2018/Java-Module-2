package resizeable;

import geometrics.Circle;
import geometrics.Rectangle;
import geometrics.Shape;
import geometrics.Square;

public class ResizeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(4);

        System.out.println("Before resize:");
        for (int i=0; i< shapes.length; i++) {
            int index = i+1;
            System.out.println(index + ". " + shapes[i].getName() + ":" + shapes[i].getArea());
        }
        System.out.println("After resize:");
        ResizeCircle resizeCircle = new ResizeCircle();
        ResizeRectangle resizeRectangle = new ResizeRectangle();
        ResizeSquare resizeSquare = new ResizeSquare();
        for (int i=0; i< shapes.length; i++) {
            int index = i+1;
            double percent = (Math.random()*100)/100;
            System.out.println("Increase: " + percent*100 + "%");
            if (shapes[i] instanceof  Circle) {
                resizeCircle.resize(percent, (Circle) shapes[i]);
                System.out.println(index + ". " + shapes[i].getName() + ":" + shapes[i].getArea());
            }
            if (shapes[i] instanceof Rectangle) {
                resizeRectangle.resize(percent, (Rectangle) shapes[i]);
                System.out.println(index + ". " + shapes[i].getName() + ":" + shapes[i].getArea());
            }
        }
    }
}
