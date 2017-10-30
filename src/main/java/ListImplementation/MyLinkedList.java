package ListImplementation;

public class MyLinkedList<T> implements List<T> {

    private Node first;
    private int size;

    public MyLinkedList() {
        this.first = null;
        size = 0;
    }

    public void add(T a) {
        if (first == null)
            first = new Node<>(a);
        else {
            Node actual = first;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = new Node<>(a);
        }
        ++size;
    }

    public void remove(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException("Index out of bounds.");

        if (index == 0)
            first = first.next;
        else {
            Node actual = first;
            for (int i = 0; i < index - 1; i++) {
                actual = actual.next;
            }
            actual.next = actual.next.next;
        }
        --size;
    }

    public T get(int index) {
        if (index >= size)
            throw new IndexOutOfBoundsException("Index out of bounds.");

        Node<T> actual = first;
        for (int i = 0; i < index; i++) {
            actual = actual.next;
        }
        return actual.value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";

        StringBuilder text = new StringBuilder();
        text.append("[");
        Node actual = first;

        while (actual.next != null) {
            text.append(actual.value).append(",");
            actual = actual.next;
        }
        text.append(actual.value).append("]");
        return text.toString();
    }
}
