public interface Queue {
    void enqueue(int element);
    int dequeue();
    int size();
    boolean isEmpty();
    void clear();
}
