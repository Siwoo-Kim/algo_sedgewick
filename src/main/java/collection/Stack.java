package collection;

/**
 * The class {@code Stack} represents STACK (LIFO) data structure.
 *
 * The class supports primary operations of adding an item <em>push</em>, removing and returning the most recent
 * item <em>pop</em> and iterative all over items in the queue.
 *
 * @param <E>
 */
public interface Stack<E> extends Collection<E> {

    /**
     * Add given {@code e} into the stack.
     *
     * @param e item to add
     * @throws IllegalArgumentException if {@code e == null}
     */
    void push(E e);

    /**
     * Remove and returns the most recent item from the stack.
     *
     * @return the most recent item
     * @throws java.util.NoSuchElementException if stack is empty
     */
    E pop();

    /**
     * Returns the most recent item from the stack.
     *
     * @return the most recent item.
     * @throws java.util.NoSuchElementException if stack is empty
     */
    E peek();
}
