import java.util.Iterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class PeekingIterator implements Iterator<Integer> {
	private Iterator<Integer> iter;
	private Integer peekedValue = null;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		iter = iterator;
		if (hasNext())
			peekedValue = iter.next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return peekedValue;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer val = peekedValue;
		if (iter.hasNext())
			peekedValue = iter.next();
		else
			peekedValue = null;
		return val;
	}

	// this is because in next(), we might do .next() so iterator might become null.
	// so we have to check peekedValue also.
	@Override
	public boolean hasNext() {
		return peekedValue != null || iter.hasNext();
	}
}
