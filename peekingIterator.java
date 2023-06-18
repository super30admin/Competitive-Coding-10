// TC - O(1)
// SC - O(1)

// Approach
// We use a "curr" variable to store the current element to be returned.
// This element acts as a temporary variable in order to facilitate the peek()
// function

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.*;

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> itr;
	Integer curr;
	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		itr = iterator;
		curr = iterator.next(); // move to second element initially to support peek
	}
	
	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return curr;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer temp = curr;
		curr = null;
		if(itr.hasNext()) {
			curr = itr.next();
		}
		return temp;
	}
	
	@Override
	public boolean hasNext() {
		return curr != null;
	}
}