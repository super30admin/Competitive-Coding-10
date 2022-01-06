// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


class PeekingIterator implements Iterator<Integer> {
     private Iterator<Integer> iteratorInt;
     private Integer global;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        
	   iteratorInt = iterator;
        
        if (iteratorInt.hasNext())
            global = iteratorInt.next();
        else
            global = null;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return global;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer temp = global;
        global = iteratorInt.hasNext() ? iteratorInt.next() : null;
        return temp;    
    }
	
	@Override
	public boolean hasNext() {
	    return(global != null);
	}
}