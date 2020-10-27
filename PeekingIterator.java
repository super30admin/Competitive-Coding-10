// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach

class PeekingIterator implements Iterator<Integer> {
    
    private Integer prev = null;
    private Iterator it;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.it = iterator;
        if(iterator.hasNext()){
            prev = iterator.next();
        } 
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return prev;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int result = prev;
        prev = null;
        if(it.hasNext()){
            prev = (Integer)it.next();
        }
        return result;
	}
	
	@Override
	public boolean hasNext() {
        return prev!=null;
	}
}