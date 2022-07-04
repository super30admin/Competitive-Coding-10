//Time: O(1) | Space: O(1)

// we initialise the peek or next value of PeekingIterator in the constructor itself
// move the next pointer ahead every single
// meaning, Native iterator will also be ahead of peeking iterator
class PeekingIterator implements Iterator<Integer> {
    Integer curr;
    Iterator<Integer> itr;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        itr = iterator;
        curr = itr.hasNext() ? itr.next() : null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return curr;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer old = curr;
        curr = itr.hasNext() ? itr.next() : null;
        return old;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }
}