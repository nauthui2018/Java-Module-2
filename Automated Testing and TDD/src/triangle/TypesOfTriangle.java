package triangle;

public class TypesOfTriangle {
    public static String checkTriangle(double side1, double side2, double side3) {
        String typeOfTriangle = "";
        if (side1<1 || side2<1 || side3<1) {
            typeOfTriangle = "Not A Triangle";
        } else if (!checking3Sides(side1,side2,side3)) {
            typeOfTriangle = "Not A Triangle";
        } else if (side1==side2 && side2==side3) {
            typeOfTriangle = "Equilateral Triangle";
        } else if (side1==side2 || side1==side3 || side2==side3) {
            typeOfTriangle = "Isosceles Triangle";
        } else {
            typeOfTriangle = "Scalene Triangle";
        }
        return typeOfTriangle;
    }

    public static boolean checking3Sides(double side1, double side2, double side3) {
        boolean meetRequirement = false;
        if (side1 > side2 && side1 > side3) {
            meetRequirement = side1<(side2+side3) ? true : false;
        } else if (side2 > side3) {
            meetRequirement = side2<(side1+side3) ? true : false;
        } else {
            meetRequirement = side3<(side1+side2) ? true : false;
        }
        return  meetRequirement;
    }


}
