// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

// Time Complexity: O(1)
// Space Complexity: O(1)
class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> iterator;
    private Integer cache;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        
        // check if there's something in hasNext method
        if(iterator.hasNext()) {
            this.cache = iterator.next();
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return cache;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        //if there's something inside the cache, then return it
        
        int num = cache;
        cache = iterator.hasNext()? iterator.next() : null;
        return num;
	    
	}
	
	@Override
	public boolean hasNext() {
        // if there's something in the cache return it
        return cache != null;
	    
	}
}

