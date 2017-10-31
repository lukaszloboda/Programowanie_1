package Queue;

public class MyLinkedQueue<T> implements Queue<T> {

    private QueueNode<T> head = null;
    private QueueNode<T> tail = null;


    public void add(T a) {
        QueueNode<T> newOne = new QueueNode<T>(a);
        if (isEmpty())
            tail = head = newOne;
        else {
            tail.next = newOne;
            newOne.previous = tail;
            tail = newOne;
        }
    }

    public T poll() {
        if (head == null)
            throw new StackOverflowError("Stack is empty!");

        T returnValue = head.value;
        head = head.next;
        if (head == null)
            tail = null;
        return returnValue;
    }

    public String toString() {
        if (head == null)
            return "[]";
        StringBuilder text = new StringBuilder();
        text.append("[");
        QueueNode actual = head;
        while (actual.next != null) {
            text.append(actual.value).append(", ");
            actual = actual.next;
        }
        text.replace(text.length() - 2, text.length() - 1, "]");
        return text.toString();
    }

    public boolean isEmpty() {
        return (head == null || tail == null);
    }
}
