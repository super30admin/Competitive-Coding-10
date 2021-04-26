// TC - O(1), SC - O(1)

// LC - 284

class PeekingIterator implements Iterator<Integer> {
	// Initialize an iterator and val
    Iterator<Integer> itr;
	int val;
	public PeekingIterator(Iterator<Integer> iterator) {
		// Assign iterator to itr
	    this.itr = iterator;	
		// If itr has next, store itr.next in val
        if(itr.hasNext()){
            val = itr.next();    
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		// return val
        return val;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		// store val in localVal
	    int localVal = val;     
		// if itr.hasNext, store itr.next in val
		if(itr.hasNext()){			
			val = itr.next();
		}else{
            val = 0;
        }
		return localVal;	
	}
	
	@Override
	// check if val is 0, if yes return true else false
	public boolean hasNext() {
	    return val != 0 ? true : false;
	}
}