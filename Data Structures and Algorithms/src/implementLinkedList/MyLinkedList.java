package implementLinkedList;

public class MyLinkedList<E> {
    private Node headNode;
    private int numNodes;

    public MyLinkedList() {
    }

    public MyLinkedList(E data) {
        headNode = new Node(data);
    }

    public class Node {
        private Node next;
        private E data;

        public Node(E data) { this.data = data; }

        public E getData() { return this.data; }
    }

    public void add(int index, E data) {
        Node temp = headNode;
        Node holder;
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E data) {
        Node temp = headNode;
        headNode = new Node(data);
        headNode.next = temp;
        numNodes++;
    }

    public void addLast(E data) {
        Node temp = headNode;
        for (int i = 0; temp.next != null; i++) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        numNodes++;
    }

    public void removeNode(int index) {
        Node temp = headNode;
        Node holder;
        if (index == 0) {
            headNode = headNode.next;
        }
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
    }

    public void remove(E data) {
        Node temp = headNode;
        Node holder;
        if (headNode.getData() == data) {
            headNode = headNode.next;
        }
        for (int i = 1; temp.next != null; i++) {
            if (temp.next.getData() == data) {
                break;
            }
            temp = temp.next;
        }
        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
    }

    public int getSize() {
        Node temp = headNode;
        int size = 0;
        for (int i=0; temp.next != null; i++) {
            size++;
        }
        return size;
    }

    public E clone() {
        MyLinkedList copiedList = new MyLinkedList<E>();
        Node temp = headNode;
        copiedList.addFirst(temp.getData());
        for (int i=1; temp.next != null; i++) {
            temp = temp.next;
            copiedList.add(i, temp.getData());
        }
        return (E) copiedList;
    }

    public boolean contain(E o) {
        Node temp = headNode;
        boolean isContain = false;
        for (int i=0; temp.next != null; i++) {
            temp = temp.next;
            if (temp.getData() == o) {
                isContain = true;
                break;
            }
        }
        return isContain;
    }

    public int getIndexOf(E o) {
        Node temp = headNode;
        int index = 0;
        for (int i=0; temp.next != null; i++) {
            if (temp.getData() == o) {
                break;
            }
            temp = temp.next;
            index++;
        }
        return index;
    }

    public E get(int index) {
        Node temp = headNode;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public E getFirst() {
        return headNode.getData();
    }

    public E getLast() {
        Node temp = headNode;
        for (int i=0; temp.next != null; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void clearList() {
        headNode = null;
    }

    public void printList() {
        Node temp = headNode;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
