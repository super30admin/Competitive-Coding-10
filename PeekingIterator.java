Time Complexity = O(1)
Space Complexity = O(1)

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    Integer current;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext())
	        current = iterator.next();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
       
        return current;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer result = current;
        if(iterator.hasNext()){
            current = iterator.next();
        }else{
            current = null;
        }
        return result;
	}
	
	@Override
	public boolean hasNext() {
	    if(current == null){
            return false;
        }
        return true;
	}
}