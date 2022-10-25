//TC: O(n)
//SC: O(1)

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    private Integer nextEl = null;
    private Iterator<Integer> it = null;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.it = iterator;
        this.nextEl = it.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return nextEl;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer val = nextEl;
        if(it.hasNext()){
            this.nextEl = it.next();
        }
        else{
            this.nextEl = null;
        }
        return val;
    }

    @Override
    public boolean hasNext() {
        if(nextEl!=null)
            return true;
        else
            return false;
    }
}