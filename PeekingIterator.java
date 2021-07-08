// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We try to cache the next element in a temporary variable. Which can then be used to peek.
*/

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> i;
    Integer temp;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        i=iterator;
        if (i.hasNext())
	        temp=i.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer r = temp;
        if (i.hasNext())
            temp = i.next();
        else 
            temp = null;
        return r;
	}
	
	@Override
	public boolean hasNext() {
	    return temp != null;
	}
}