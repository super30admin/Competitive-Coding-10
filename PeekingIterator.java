import java.util.Iterator;
/*
Peeking Iterator
approach: keep track of next element
time: O(1) for all methods
space: O(1)
 */
public class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> i;
    Integer next = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.i = iterator;

        if (hasNext()) next = i.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer cur = next;
        if (i.hasNext()) next = i.next();
        else next = null;
        return cur;
    }

    @Override
    public boolean hasNext() {
        return next != null || i.hasNext();
    }
}
