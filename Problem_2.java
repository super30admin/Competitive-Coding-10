// Time complexity - All operations - O(1)
// Space complexity - O(1)

class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> itr = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.itr = iterator;
        next();	    
	}
    
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer returnValue = next;
        next = null;
        if(itr != null && itr.hasNext()){
            next = itr.next();
        }
        return returnValue;
	}

	@Override
	public boolean hasNext() {
	    return next != null;
	}
}
