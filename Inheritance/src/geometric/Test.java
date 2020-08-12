package geometric;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Triangle triangle = new Triangle();

//        System.out.println(shape.toString());
//        System.out.println(circle.toString());
//        System.out.println(rectangle.toString());
//        System.out.println(square.toString());
//
//        square.setSide(5);
//        System.out.println(square.getSide());
//        System.out.println(square.getArea());
//        System.out.println(square.getPerimeter());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = scanner.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = scanner.nextDouble();
        System.out.println("Enter side 3:");
        double side3 =  scanner.nextDouble();
        System.out.println("Enter color of triangle:");
        String color = scanner.nextLine();
        triangle.setColor(color);
        triangle.setSides(side1, side2, side3);
        System.out.println(triangle.toString());

    }
}
