package Queue;

public class QueueNode<T> {
    public T value;
    public QueueNode<T> previous;
    public QueueNode<T> next;

    public QueueNode(T value) {
        this.value = value;
        previous = null;
        next = null;
    }
}
