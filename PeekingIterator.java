//Time Complexity :o(1)
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class PeekingIterator implements Iterator<Integer> {
    
     Iterator<Integer> iter;
    Integer nextVal=null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        iter=iterator;
	    nextVal=iter.hasNext()?iter.next():null;
	}
	
   // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    
        int oldValue=nextVal;
        
        nextVal=iter.hasNext()?iter.next():null;
        return oldValue;
        
	}
	
	@Override
	public boolean hasNext() {
	    
        return nextVal!=null;
        
	}
}