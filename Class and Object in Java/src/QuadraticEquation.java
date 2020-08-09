public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double setA(double a) {
        return this.a = a;
    }

    public double setB(double b) {
        return this.b = b;
    }

    public double setC(double c) {
        return this.c = c;
    }

    public double getDiscriminant() {
        double delta = b*b - 4*a*c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(b*b-4*a*c))/2*a;
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(b*b-4*a*c))/2*a;
        return r2;
    }
}
