// Time Complexity: O(n) where n is the number of elements to iterate over.
// Space Complexity: O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;
    private Integer nextValue;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
        if(hasNext()) {
            nextValue = iter.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextValue;   
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer value;
        value = nextValue;
        if(iter.hasNext()) {
            nextValue = iter.next();
        }
        else {
            nextValue = null;
        }
        return value;
	}
	
	@Override
	public boolean hasNext() {
	    if(iter.hasNext()) {
            return true;
        }
        return nextValue != null;
	}
}