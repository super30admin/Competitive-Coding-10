//TC:O(1)
//SC:O(1)

class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> itr = null;
    private Integer next = null;
    
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
	    Integer val = next;
        if(itr!= null && itr.hasNext()) next = itr.next();
        else next = null;
        
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return next!=null;
	}
}