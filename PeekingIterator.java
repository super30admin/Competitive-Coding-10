// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Save next element while running next()

class PeekingIterator implements Iterator<Integer> {
	Integer nextEle;
	Iterator<Integer> iter;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
		this.iter = iterator;
		this.nextEle =iter.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextEle;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer result = nextEle;
		if(!iter.hasNext()) nextEle = nul99909l;
		else nextEle = iter.next();
		return result;
	}
	
	@Override
	public boolean hasNext() {
	    return !(nextEle==null);
	}
}