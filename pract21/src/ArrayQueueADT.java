public class ArrayQueueADT {
    private int[] queue;
    private int size;
    private int head;
    private int tail;

    public ArrayQueueADT() {
        queue = new int[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    public static void enqueue(ArrayQueueADT adt, int element) {
        if (adt.size == adt.queue.length) {
            throw new IllegalStateException("Queue is full");
        }
        adt.queue[adt.tail] = element;
        adt.tail = (adt.tail + 1) % adt.queue.length;
        adt.size++;
    }

    public static int element(ArrayQueueADT adt) {
        if (isEmpty(adt)) {
            throw new IllegalStateException("Queue is empty");
        }
        return adt.queue[adt.head];
    }

    public static int dequeue(ArrayQueueADT adt) {
        if (isEmpty(adt)) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = adt.queue[adt.head];
        adt.head = (adt.head + 1) % adt.queue.length;
        adt.size--;
        return element;
    }

    public static int size(ArrayQueueADT adt) {
        return adt.size;
    }

    public static boolean isEmpty(ArrayQueueADT adt) {
        return adt.size == 0;
    }

    public static void clear(ArrayQueueADT adt) {
        adt.head = 0;
        adt.tail = 0;
        adt.size = 0;
    }
}
