import java.util.Iterator;

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class PeekingIterator implements Iterator<Integer> {
	Integer value;
	Iterator<Integer> itr = null;
	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		this.itr = iterator;
		value = null;

		if(itr.hasNext())
			value = itr.next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return value;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer returnValue = value;
		if(itr.hasNext()){
			value = itr.next();
		}
		else
			value = null;

		return returnValue;
	}

	@Override
	public boolean hasNext() {
		return value != null;
	}
}