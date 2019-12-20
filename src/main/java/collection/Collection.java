package collection;

import java.lang.reflect.Array;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * The interface {@code Collection} represents a data structure for generic items.
 *
 * The class supports primary operations of iterating all over the items in the collection,
 * checking the collection is empty and providing the number of items in the collection.
 *
 * @param <E>
 */
public interface Collection<E> extends Iterable<E> {

    /**
     * is the collection empty?
     *
     * @return
     */
    default boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Return the number of items in the collection.
     *
     * @return
     */
    int size();

    /**
     * Does given {@code e} in the collection?
     *
     * @param e
     * @return
     * @throws IllegalArgumentException if {@code e == null}
     */
    default boolean contains(E e) {
        checkNotNull(e);
        if (isEmpty()) return false;
        for (E element: this)
            if (e.equals(element))
                return true;
        return false;
    }

    /**
     * Returns a array copied from the collection
     *
     * @param a
     * @return
     */
    default E[] toArray(E[] a) {
        if (size() > a.length) {
            @SuppressWarnings("unchecked")
            E[] array = (E[]) Array.newInstance(a.getClass()
                    .getComponentType(), size());
            a = array;
        }
        int i = 0;
        for (E e: this)
            a[i++] = e;
        return a;
    }
}
