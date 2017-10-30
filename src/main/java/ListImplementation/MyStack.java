package ListImplementation;

public class MyStack<T> implements Stack<T> {

    StackNode<T> stackTop = null;

    public void push(T a) {
        StackNode<T> stackPrevious = stackTop;
        stackTop = new StackNode<>(a);
        stackTop.previous = stackPrevious;
    }

    public T pop() {
        if (stackTop == null)
            throw new StackOverflowError("Stack is empty!");

        StackNode<T> returnValue = stackTop;
        stackTop = stackTop.previous;
        return returnValue.value;
    }

    public String toString() {
        if (stackTop == null)
            return "[]";
        StringBuilder text = new StringBuilder();
        text.append("]");
        StackNode actual = stackTop;
        while (actual.previous != null) {
            text.insert(0, actual.value).insert(0, ", ");
            actual = actual.previous;
        }
        text.insert(0, actual.value).insert(0, "[");
        return text.toString();
    }
}
