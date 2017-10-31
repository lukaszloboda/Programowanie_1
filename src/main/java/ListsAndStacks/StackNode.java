package ListsAndStacks;

public class StackNode<T> {
    T value;
    StackNode<T> previous;

    public StackNode(T value) {
        this.value = value;
        previous = null;
    }
}
