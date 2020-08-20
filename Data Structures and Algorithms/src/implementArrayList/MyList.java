package implementArrayList;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = e;
    }


    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public void remove(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        for(int j=i; j<this.elements.length-1;j++){
            elements[j]=elements[j+1];
        }
        size--;
    }

    public int size() {
        return this.size;
    }

    public Object clone() throws CloneNotSupportedException {
        Object copiedList[] = new Object[size];
        for (int i=0; i<this.size(); i++) {
            copiedList[i] = elements[i];
        }
        return copiedList;
    }

    public boolean contain(E o) {
        boolean isContain = false;
        for(int j=0; j<elements.length;j++){
            elements[j]=o;
            isContain = true;
            break;
        }
        return isContain;
    }

    public int indexOf(E o) {
        int index = 0;
        if (!contain(o)) {
            throw new NoSuchElementException();
        }
        for(int i=0; i<elements.length;i++){
            elements[i]=o;
            index = i;
            break;
        }
        return index;
    }

    public boolean doAdd(E e) {
        if (size == elements.length) {
            return false;
        }
        return true;
    }

    public void clear() {
        for(int i=0; i<elements.length;i++){
            elements[i]= null;
        }
    }

}
