public class FanTest {
    public static void main(String[] args) {
        int speed;
        boolean on;
        double radius;
        String color;

        Fan Fan1 = new Fan();
        Fan1.setSpeed(Fan1.fast);
        Fan1.setColor("Yellow");
        Fan1.setOn(true);
        Fan1.setRadius(10);

        Fan Fan2 = new Fan();
        Fan2.setSpeed(Fan2.medium);
        Fan2.setColor("Blue");
        Fan2.setOn(false);
        Fan2.setRadius(5);

        System.out.print("Fan 1:");
        System.out.println(Fan1.toString());
        System.out.print("Fan 2: ");
        System.out.println(Fan2.toString());

    }
}
