public class Main {
    public static void main(String[] args) {
        // Тестирование ArrayQueueModule
        System.out.println("Testing ArrayQueueModule");
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        ArrayQueueModule.enqueue(3);

        System.out.println("First element: " + ArrayQueueModule.element());
        System.out.println("Removed element: " + ArrayQueueModule.dequeue());
        System.out.println("Queue size after dequeue: " + ArrayQueueModule.size());

        ArrayQueueModule.clear();
        System.out.println("Queue size after clear: " + ArrayQueueModule.size());
        System.out.println();

        // Тестирование ArrayQueueADT
        System.out.println("Testing ArrayQueueADT");
        ArrayQueueADT queueADT = new ArrayQueueADT();
        ArrayQueueADT.enqueue(queueADT, 1);
        ArrayQueueADT.enqueue(queueADT, 2);
        ArrayQueueADT.enqueue(queueADT, 3);

        System.out.println("First element: " + ArrayQueueADT.element(queueADT));
        System.out.println("Removed element: " + ArrayQueueADT.dequeue(queueADT));
        System.out.println("Queue size after dequeue: " + ArrayQueueADT.size(queueADT));

        ArrayQueueADT.clear(queueADT);
        System.out.println("Queue size after clear: " + ArrayQueueADT.size(queueADT));
        System.out.println();

        // Тестирование ArrayQueue
        System.out.println("Testing ArrayQueue");
        ArrayQueue queue = new ArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("First element: " + queue.element());
        System.out.println("Removed element: " + queue.dequeue());
        System.out.println("Queue size after dequeue: " + queue.size());

        queue.clear();
        System.out.println("Queue size after clear: " + queue.size());
    }
}
