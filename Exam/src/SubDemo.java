public class SubDemo extends Demo{
    String string = "world";

    @Override
    public String toString() {
        return "SubDemo{" +
                "string='" + string + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Demo d = new SubDemo();
        Demo d1 = new Demo();
        d = d1;
        d1=d;
        System.out.println(d);
        System.out.println(d1);
    }
}
