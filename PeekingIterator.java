// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

//Time Complexity: O(1)
//Space Complexity: O(1)
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer next;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.itr = iterator;
        next = itr.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        int tempNext = next;
        next = null;
        if(itr.hasNext())
        {
            next = itr.next();
        }
        return tempNext;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}