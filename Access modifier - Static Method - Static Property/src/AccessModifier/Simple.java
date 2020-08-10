package AccessModifier;

class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.value);
        obj.msg();
        obj.course();
    }
}
