// leetcode 122 peek iterator
class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> itr = null;
    Integer currVal = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr = iterator;
        next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return currVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer curr = currVal;
	    if(itr.hasNext()){
	        currVal = itr.next();
	    }else{
	        currVal = null;
	    }
	    return curr;
        // return -1;
	}
	
	@Override
	public boolean hasNext() {
        if(currVal == null){
            return false;
        }
        return  itr.hasNext();
        // return false;
	}
}