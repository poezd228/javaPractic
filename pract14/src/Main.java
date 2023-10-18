import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

interface IWaitList<E> {
    void addElement(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> c);
    boolean isEmpty();
}

abstract class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    @Override
    public void addElement(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return content.toString();
    }
}

class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void addElement(E element) {
        if (content.size() < capacity) {
            super.addElement(element);
        }
        // else throw some exception or handle overflow
    }

    @Override
    public String toString() {
        return "Capacity: " + capacity + ", Content: " + super.toString();
    }
}

class UnfairWaitList<E> extends WaitList<E> {
    @Override
    public E remove() {
        return super.remove();
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        if (content.remove(element)) {
            addElement(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Here you can test and demonstrate the functionality of your classes
    }
}
