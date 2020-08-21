package implementLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList<String>();
        myList.addFirst("6");
        myList.addFirst("5");
        myList.addFirst("4");
        myList.addFirst("3");
        myList.addFirst("2");
        myList.addFirst("1");
        myList.addLast("7");
        System.out.println("this is my list");
        myList.printList();

        System.out.println("-------------");
        System.out.println("remove item '6' and print my list");
        myList.remove("6");
        myList.printList();

        System.out.println("-------------");
        System.out.println("Clone my list and print it out");
        MyLinkedList copiedList = new MyLinkedList<String>();
        copiedList = (MyLinkedList) myList.clone();
        copiedList.printList();

        System.out.println("-------------");
        System.out.println("Checking contain method");
        System.out.print("does my list contain '100'? --> ");
        System.out.println(myList.contain("kiki"));
        System.out.print("does my list contain '5'? --> ");
        System.out.println(myList.contain("5"));

        System.out.println("-------------");
        System.out.println("Checking get/getFirst/getLast method");
        System.out.print("Element at position 3 --> ");
        System.out.println(myList.get(3));
        System.out.print("First element --> ");
        System.out.println(myList.getFirst());
        System.out.print("Last element --> ");
        System.out.println(myList.getLast());

        System.out.println("-------------");
        myList.clearList();
        myList.printList();
        System.out.println("List is empty now");


    }
}
