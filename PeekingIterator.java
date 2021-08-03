import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
	private Integer peek;
	private Iterator<Integer> ite;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.
		this.ite = iterator;
		next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return peek;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer temp = peek;
		if (ite.hasNext()) {
			peek = ite.next();
		} else {
			peek = null;
		}
		return temp;
	}

	@Override
	public boolean hasNext() {
		return peek != null;
	}
}
