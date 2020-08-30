package circularQueue;

public class Queue {
    public Node front;
    public Node rear;

    public Queue(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }

    public Queue() {
    }
}
