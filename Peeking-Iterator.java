/*Time Complexity: Peek() O(1)
                   next() O(N)
                   hasNext() O(1)

Space Complexity: O(1)

Did this code successfully run on Leetcode : Yes

Approach: Using a native iterator and storing the next element to give out the peek element;

Prob: 284. Peeking Iterator
*/

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> nIt;
    Integer nextEl;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.nIt = iterator;
        if(this.nIt.hasNext()){
            nextEl = this.nIt.next();
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextEl;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer peekEl = nextEl;
        nextEl = this.nIt.hasNext() ? nIt.next() : null;
        return peekEl;
	}
	
	@Override
	public boolean hasNext() {
        return nextEl != null;
	}
}