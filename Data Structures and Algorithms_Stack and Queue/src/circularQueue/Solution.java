package circularQueue;

public class Solution {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.front = queue.rear = null;
        enQueue(queue, 23);
        enQueue(queue, 11);
        enQueue(queue, 29);
        displayQueue(queue);
        deQueue(queue);
        displayQueue(queue);
    }

    static void enQueue(Queue queue, int value) {
        Node temp = new Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    static void deQueue(Queue queue) {
        int value;
        if (queue.front == null) {
            System.out.printf("Queue is empty");
        }
        if (queue.front == queue.rear) {
            value = queue.front.data;
            queue.front = null;
            queue.rear = null;
        } else {
            Node temp = queue.front;
            value = temp.data;
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }

    }

    static void displayQueue(Queue queue) {
        Node temp = queue.front;
        System.out.printf("Elements in Circular Queue are: ");
        while (temp.link != queue.front) {
            System.out.printf("%d ", temp.data);
        }
        System.out.printf("%d ", temp.data);
    }

}
