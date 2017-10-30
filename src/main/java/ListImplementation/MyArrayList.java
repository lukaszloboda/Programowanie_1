package ListImplementation;

import java.util.function.Function;
import java.util.function.Supplier;

public class MyArrayList<T> implements List<T> {

    private T[] array;
    private int length;
    private final int INITIALCAPACITY = 10;
    private Function<Integer, T[]> supplier;

    public MyArrayList(Function<Integer, T[]> supplier) {
        this.supplier = supplier;
        this.array = supplier.apply(INITIALCAPACITY);
        this.length = 0;
    }

    public MyArrayList(int preferredInitialCapacity, Function<Integer, T[]> supplier) {
        this.supplier = supplier;
        this.array = supplier.apply(preferredInitialCapacity);
        this.length = 0;
    }

    public void add(T a) {
        if (length == array.length)
            addCapacity((int) (length * 0.5));

        array[length] = a;
        ++length;
    }

    public void remove(int index) {
        if (index >= length)
            throw new IndexOutOfBoundsException("Index out of bounds");

        if (index == length - 1)
            --length;
        else {
            System.arraycopy(array, index + 1, array, index, length - (index + 1));
            --length;
        }
    }

    public T get(int index) {
        if (index >= length)
            throw new IndexOutOfBoundsException("Index out of bounds");
        return (T) array[index];
    }

    public int size() {
        return this.length;
    }

    private void addCapacity(int capacityChange) {
        Object[] temp = new Object[length + capacityChange];
        System.arraycopy(array, 0, temp, 0, length);
        array = (T[]) temp;
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
