// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

// Time Complexity: O(1)
// Space Complexity: O(1)
class PeekingIterator implements Iterator<Integer> {
    Integer nextElement = null;
    Iterator<Integer> it;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    it = iterator;
        nextElement = it.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer currVal = nextElement; 
        if(it.hasNext()){
            nextElement = it.next();   
        }else
            nextElement = null;        
        return currVal;
	}
	
	@Override
	public boolean hasNext() {
	    return nextElement != null;
	}
}