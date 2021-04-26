//TC: O(1)
//SC: O(1)

//for Next, return next element and move to the next pointer
//For peek, return next element and do not move the pointer
//for HasNext(), return false if the next pointer is null

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> iter;
    private Integer next = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        iter = iterator;
        if(iter.hasNext())
            next = iter.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer res = next;
        if(iter.hasNext()){
            next = iter.next();
        }
        else{
            next = null;
        }
        // next = iter.hasNext() ? iter.next() : null;
        return res;
	    
	}
	
	@Override
	public boolean hasNext() {
	    return this.next != null || this.iter.hasNext();
	}
}