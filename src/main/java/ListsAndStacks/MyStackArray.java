package ListsAndStacks;

import java.util.EmptyStackException;

public class MyStackArray<T> implements Stack<T> {

    private T[] array;
    private final int INITIALCAPACITY = 10;
    private int length;

    public MyStackArray() {
        array = (T[]) new Object[INITIALCAPACITY];
        length = 0;
    }

    public void push(T a) {
        if (length == array.length)
            addCapacity((int) (length * 0.5));

        array[length] = a;
        ++length;
    }

    public T pop() {
        if (length <= 0)
            throw new EmptyStackException();
        T returnValue = (T) array[length - 1];
        --length;
        return returnValue;
    }

    private void addCapacity(int capacityChange) {
        T[] temp = (T[]) new Object[length + capacityChange];
        System.arraycopy(array, 0, temp, 0, length);
        array = temp;
    }

    @Override
    public String toString() {
        if (length == 0)
            return "[]";

        StringBuilder text = new StringBuilder();
        text.append("[");
        for (int i = 0; i < length - 1; i++) {
            text.append(array[i]).append(",");
        }
        text.append(array[length - 1]).append("]");
        return text.toString();
    }
}
