// Time Complexity : O(n)
// Space Complexity : O(1) 

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.*;

class PeekingIterator implements Iterator<Integer> {
    private Integer next = null;
    private Iterator<Integer> iter;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        iter = iterator;
        if (iter.hasNext()) 
            next=iter.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if (next == null) return -1;
        Integer toReturn = next;
        next = null;
        if (iter.hasNext()){
            next = iter.next();
        }
        return toReturn;
	}
	
	@Override
	public boolean hasNext() {
	    if (next == null) return false;
        return true;
	}
}