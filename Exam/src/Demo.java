public class Demo {
    String s = "hello";

    public Demo() {
    }

    @Override
    public String toString() {
        return "Demo{" +
                "s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo);
    }
}
