import java.util.Iterator;

/*
 *  The Time complexity of the algorithm is O(n)) where n is no of elements in array.
 *  Space complexity of the algorithm is O(1) .
 */

public class PeekingIterator {

	private Integer current = null;
	private Iterator<Integer> iterator;

	public PeekingIterator(Iterator<Integer> iterator) {
		// initialize any member here.

		this.iterator = iterator;

		if (iterator.hasNext()) {
			current = iterator.next();

		}

	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {

		return current;

	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {

		int old = current;

		if (iterator.hasNext()) {
			current = iterator.next();
		} else {
			current = null;
		}
		return old;

	}

	@Override
	public boolean hasNext() {

		return current != null ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
