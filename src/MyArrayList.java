import java.util.Collection;
import java.util.Comparator;

public class MyArrayList<T> {
    private int size = 10;
    private int elems = 0;
    private Object[] array = new Object[size];

    public void add(T value) {
        if (elems == array.length - 1) {
            enlargeArray((int) (array.length * 1.5 + 1));
        }
        array[elems] = value;
        elems++;
    }

    public T get(int element) {
        return (T) array[element];
    }

    public void addAll(Collection collection) {
        Object[] a = collection.toArray();
        int sizeCollection = a.length;
        enlargeArray(array.length + sizeCollection);
        System.arraycopy(a, 0, array, elems, sizeCollection);
        elems += sizeCollection - 1;

    }

    public int getSize() {
        return elems;
    }


    public void BubbleSort(Comparator comparator) {
        for (int out = elems - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (comparator.compare(array[in], array[in + 1]) < 0) {
                    toSwap(in, in + 1);
                }
            }
        }

    }

    private void enlargeArray(int value) {
        Object[] tempArray = new Object[(int) (value)];
        for (int i = 0; i < elems; i++) {
            tempArray[i] = array[i];
        }
        array = tempArray;
    }

    private void toSwap(int first, int second) {
        Object temp = array[first];
        array[first] = array[second];
        array[second] = temp;

    }


}


