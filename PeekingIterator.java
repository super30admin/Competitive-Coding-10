// For every function the the time complxity is written beside it.
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> it;
    private Integer nextEle;

    public PeekingIterator(Iterator<Integer> iterator) { //O(1)
        // initialize any member here.
        this.it = iterator;
        this.nextEle = null;
        advance();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() { //O(1)
        return nextEle; 
    }

    public void advance() { O(1)
        this.nextEle = this.it.hasNext() ? it.next() : null;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() { //O(1)
        Integer ele = nextEle;
        advance();
        return ele;
    }

    @Override
    public boolean hasNext() { // O(1)
        return nextEle != null;
    }
}
