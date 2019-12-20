package collection;

/**
 * The class {@code Queue} represents QUEUE (FIFO) data structure.
 *
 * The class supports primary operations of adding an item <em>enqueue</em>, removing and returning the least recent
 * item <em>dequeue</em> and iterative all over items in the queue.
 *
 */
public interface Queue<E> extends Collection<E> {

    /**
     * Add items in the queue.
     *
     * @param e item to add
     * @throws IllegalArgumentException if {@code e == null}
     */
    void enqueue(E e);

    /**
     * Remove and return the least recent item from the queue.
     *
     * @return e the least recent item
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    E dequeue();

    /**
     * Return the lest recent item from the queue.
     *
     * @return e the least recent item.
     * @throws java.util.NoSuchElementException if the queue is empty
     */
    E peek();
}
