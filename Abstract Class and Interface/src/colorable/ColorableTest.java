package colorable;

import geometrics.Circle;
import geometrics.Rectangle;
import geometrics.Shape;
import geometrics.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(2,3);
        shapes[2] = new Square(3);

        for (int i=0;i< shapes.length;i++){
            System.out.println(shapes[i].getArea());
            if (shapes[i] instanceof Square) {
                ((Square) shapes[i]).howToColor();
            }
        }
    }
}
