package collection;

/**
 * The class {@code Bag} represents a bag that contains items in arbitrary order.
 *
 * The class supports primary operations of iterating all over the items in the bag,
 * checking the bag is empty or the given items are in the bag and providing the size of the bag.
 *
 * In addition, client can add {@code item} in the bag.
 *
 * @param <E>
 */
public interface Bag<E> extends Collection<E> {

    /**
     * Add given {@code e} in the bag.
     *
     * @param e item to add
     * @throws IllegalArgumentException if {@code e == null}
     */
    void add(E e);

}
