package triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypesOfTriangleTest {

    @Test
    void checkTriangle_2_2_2() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        String expected = "Equilateral Triangle";
        String result = TypesOfTriangle.checkTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle_2_2_3() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 3;
        String expected = "Isosceles Triangle";
        String result = TypesOfTriangle.checkTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle_3_4_5() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String expected = "Scalene Triangle";
        String result = TypesOfTriangle.checkTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle_8_2_3() {
        double side1 = 8;
        double side2 = 2;
        double side3 = 3;
        String expected = "Not A Triangle";
        String result = TypesOfTriangle.checkTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle_negative1_2_1() {
        double side1 = -1;
        double side2 = 2;
        double side3 = 1;
        String expected = "Not A Triangle";
        String result = TypesOfTriangle.checkTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @Test
    void checkTriangle_0_1_1() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String expected = "Not A Triangle";
        String result = TypesOfTriangle.checkTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

}