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
        if (index == 0) {
            headNode = headNode.next;
        }
        for (int i = 0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = temp.next.next;
        temp.next = holder;
        numNodes--;
    }

    //tu day chua review code --->>>>>
    public void remove(E data) {
        Node temp = headNode;
        Node previousNode = null;
        if (headNode.getData() == data) {
            headNode.next = temp;
            headNode = null;
        }
        for (int i = 0; i<this.getSize(); i++) {
            previousNode = temp;
            temp = temp.next;
            if (temp.getData() == data) {
                break;
            }
        }
        temp.next.next = previousNode;
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
        Node temp = headNode;
        E data;
        int index = 0;
        MyLinkedList<E> copiedList = new MyLinkedList<E>();
        for (int i=0; temp.next != null; i++) {
            copiedList.add(index, temp.next.data);
        }
        return (E) copiedList;
    }

    public boolean contain(E o) {
        Node temp = headNode;
        int index = 0;
        boolean isContain = false;
        for (int i=0; temp.next != null; i++) {
            if (get(index) == o) {
                isContain = true;
                break;
            }
            index++;
        }
        return isContain;
    }

    public int getIndexOf(E o) {
        Node temp = headNode;
        int index = 0;
        for (int i=0; temp.next != null; i++) {
            if (get(index) == o) {
                break;
            }
            index++;
        }
        return index;
    }

    public Node get(int index) {
        Node temp = headNode;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public Node getFirst() {
        return headNode.next;
    }

    public Node getLast() {
        Node temp = headNode;
        for (int i=0; temp.next != null; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void clearList() {
        headNode.next = null;
    }

    public void printList() {
        Node temp = headNode;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
