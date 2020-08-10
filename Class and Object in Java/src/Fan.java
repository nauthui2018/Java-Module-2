public class Fan {

    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public int setSpeed(int speed) {
        return this.speed = speed;
    }

    public boolean setOn(boolean on) {
        return this.on = on;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public String toString() {
        if (on) {
            return "Speed: " + this.getSpeed() +
                    ". Color: " + this.getColor() +
                    ". Radius: " + this.getRadius() +
                    ". Fan is on.";
        } else {
            return "Color: " + this.getColor() +
                    ". Radius: " + this.getRadius() +
                    ". Fan is off.";
        }
    }
}
