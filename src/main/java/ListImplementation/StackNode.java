package ListImplementation;

public class StackNode<T> {
    T value;
    StackNode previous;

    public StackNode(T value) {
        this.value = value;
        previous = null;
    }
}