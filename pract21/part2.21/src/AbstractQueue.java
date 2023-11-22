public abstract class AbstractQueue implements Queue {
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public abstract void enqueue(int element);

    @Override
    public abstract int dequeue();

    @Override
    public abstract void clear();
}
