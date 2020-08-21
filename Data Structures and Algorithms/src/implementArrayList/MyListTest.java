package implementArrayList;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        MyList<String> names = new MyList<>();
        names.add("Sam");
        names.add("Soi");
        names.add("Nau");
        for (int i=0; i< names.size(); i++) {
            System.out.println(names.get(i));
        }
        boolean isContain = names.contain("Sam");
        System.out.println(isContain);
        Object[] list = (Object[]) names.clone();
        for (Object i: list) {
            System.out.println(i);
        }
        System.out.println(names.size());
        System.out.println(names.doAdd("Bi"));
        System.out.println(names.indexOf("Sam"));
        System.out.println(names.get(2));
        names.remove(3);
    }

}
