// Time Complexity : peek(), next(), hasNext() - O(1)
// Space Complexity : peek(), next(), hasNext() - O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr = null;
    Integer nextEle = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.itr = iterator;
        this.nextEle = itr.next();   
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextEle;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int value = nextEle;
        
        if (itr.hasNext()) {
            this.nextEle = itr.next();
        } else {
            this.nextEle = null;
        }
        
        return value;
	}
	
	@Override
	public boolean hasNext() {
	    return nextEle != null;
	}
}