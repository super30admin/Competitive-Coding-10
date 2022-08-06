// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html


//TC - O(1)
//SC - O(1)

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> itr;
    private Integer currVal = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
        currVal = itr.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return currVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer result = currVal;
        if(itr.hasNext()){
            currVal = itr.next();
        }else{
            currVal = null;
        }
        return result;
	}
	
	@Override
	public boolean hasNext() {
	    return currVal != null;
	}
}
