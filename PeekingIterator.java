// Time Complexity : peek()-O(1), next()-O(1), hasNext()-O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// Preload the next element during initialization and every call to next().
// peek() returns the preloaded next element without moving the iterator.
// next() returns the current element and updates the preload to next element, if not null.

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    private Integer next=null;
    private Iterator<Integer> itr=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.itr=iterator;
	    next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer prev=next;
        next=null;
        if(itr!=null & itr.hasNext()){
            next=itr.next();
        }
        return prev;
	}
	
	@Override
	public boolean hasNext() {
	    return next!=null;
	}
}
