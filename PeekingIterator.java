import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    Integer peekedValue = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        iter = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    // TC: O(1)
    // SC: O(1)
    public Integer peek() {
        if (peekedValue == null) {
            peekedValue = iter.next();
        }
        return peekedValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    // TC: O(1)
    // SC: O(1)
    public Integer next() {
        if (peekedValue != null) {
            Integer toReturn = peekedValue;
            peekedValue = null;
            return toReturn;
        }
        return iter.next();
    }

    @Override
    // TC: O(1)
    // SC: O(1)
    public boolean hasNext() {
        return peekedValue != null || iter.hasNext();
    }
}
