// Time Complexity : O(1) for all functions
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


// Your code here along with comments explaining your approach

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> itr;
    private Integer pkval = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        
        if(pkval == null) {
            if(itr.hasNext()) {
            pkval = itr.next();
            }
            else {
                return -1;
            }
        }
        return pkval;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        
        if(pkval != null) {
            Integer val = pkval;
            pkval = null;
            return val;
        }
        
        if(!itr.hasNext()) {
            return -1;
        }
        return itr.next();
	    
	}
	
	@Override
	public boolean hasNext() {
	    return pkval != null || itr.hasNext();
	}
}