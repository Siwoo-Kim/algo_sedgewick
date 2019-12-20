package collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * {@inheritDoc}
 */
public class ArrayStack<E> implements Stack<E> {

    public static final int DEFAULT_CAPACITY = 3;
    private E[] elements;
    private int N;

    public ArrayStack() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayStack(int capacity) {
        @SuppressWarnings("unchecked")
        E[] a = (E[]) new Object[capacity];
        this.elements = a;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void push(E e) {
        if (N == elements.length)
            newCapacity(N << 1);
        elements[N++] = e;
    }

    private void newCapacity(int capacity) {
        assert capacity >= N;
        E[] newElements = (E[]) new Object[capacity];
        System.arraycopy(elements, 0, newElements, 0, N);
        this.elements = newElements;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public E pop() {
        if (isEmpty())
            throw new NoSuchElementException();
        E e = elements[--N];
        elements[N] = null;
        if (N == elements.length >> 2)
            newCapacity(elements.length >> 1);
        return e;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public E peek() {
        if (isEmpty())
            throw new NoSuchElementException();
        return elements[N-1];
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int size() {
        return N;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public E next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return elements[--i];
        }
    }
}
