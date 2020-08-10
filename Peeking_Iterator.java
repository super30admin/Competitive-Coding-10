// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> itr;
	Integer cache;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		itr = iterator;
		cache = itr.next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	// TC - O(1)
	// SC - O(1)
	import java.util.*;

	public Integer peek() {
		return cache;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer val = cache;
		if (itr.hasNext()) {
			cache = itr.next();
		} else {
			cache = null;
		}
		return val;
	}

	@Override
	public boolean hasNext() {
		return cache != null;
	}
}