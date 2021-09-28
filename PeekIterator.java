class PeekingIterator implements Iterator<Integer> {

    private Integer next = null;
    private Iterator<Integer> iter;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize object -> iter and next here
        iter = iterator;
        if (iter.hasNext())
            next = iter.next();
    }
    
    // Returns the next without advancing the iterator
    public Integer peek() {
        return next; 
    }

    // Return the current value and move next ahead 
    @Override
    public Integer next() {
        Integer curr = next;
        next = iter.hasNext() ? iter.next() : null;
        return curr; 
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}
