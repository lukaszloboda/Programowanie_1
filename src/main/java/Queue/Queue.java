package Queue;

public interface Queue<T> {

    void add(T newElement);

    T poll();
}
