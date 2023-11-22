public class ArrayQueueModule {
    private static int[] queue = new int[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public static void enqueue(int element) {
        if (size == queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue[tail] = element;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public static int element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public static int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return element;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
