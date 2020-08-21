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
        myList.printList();
        System.out.println("-------------");
        myList.removeNode(3);
        myList.printList();
    }
}
