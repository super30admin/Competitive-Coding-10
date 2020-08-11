// Time Complexity : for all operations: O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (284): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class PeekingIterator implements Iterator<Integer> {
    Integer prev;
    Iterator<Integer> itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        if (iterator.hasNext()) prev = iterator.next();
        this.itr = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return prev;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int temp = prev;
        prev = null;
        if (itr.hasNext()) prev = itr.next();
        return temp;
	}
	
	@Override
	public boolean hasNext() {
        return prev != null;
	}
}