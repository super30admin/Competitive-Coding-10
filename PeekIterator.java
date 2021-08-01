// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Iterators don't provide a way to peek at the element.
 * For solving the problem, I took the approach of storing peek value beforehand
 * Update peek when next() is being called
 */

class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> it;
    Integer peek;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.it = iterator;
        
        if(this.it.hasNext()) {
            peek = this.it.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return this.peek;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        
        Integer toReturn = this.peek;
        
        if(this.it.hasNext()) {
            this.peek = this.it.next();
        } else {
            this.peek = null;
        }
        
	    return toReturn;
	}
	
	@Override
	public boolean hasNext() {
	    return this.peek != null;
	}
}