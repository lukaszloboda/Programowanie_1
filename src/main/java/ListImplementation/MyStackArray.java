package ListImplementation;

public class MyStackArray<T> implements Stack<T> {

    private Object[] array;
    private final int INITIALCAPACITY = 10;
    private int length;

    public MyStackArray() {
        array = new Object[INITIALCAPACITY];
        length = 0;
    }

    public void push(T a) {
        if (length == array.length)
            addCapacity((int) (length * 0.5));

        array[length] = a;
        ++length;
    }

    public T pop() {
        if (length == 0)
            throw new StackOverflowError("Stack is empty!");
        T returnValue = (T) array[length-1];
        --length;
        return returnValue;

    }

    private void addCapacity(int capacityChange) {
        Object[] temp = new Object[length + capacityChange];
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
