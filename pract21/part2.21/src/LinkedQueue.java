public class LinkedQueue extends AbstractQueue {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return element;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
