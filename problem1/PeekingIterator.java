//Time Complexity : O(1)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> iter;
	Integer next;

	public PeekingIterator(Iterator<Integer> iterator) {
		this.iter = iterator;
		this.next = this.iter.next();
	}

	// Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return next;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		Integer temp = next;
		if (iter.hasNext()) {
			next = iter.next();
		} else {
			next = null;
		}
		return temp;
	}

	@Override
	public boolean hasNext() {
		return next != null;
	}

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		Iterator<Integer> iter = nums.iterator();
		PeekingIterator obj = new PeekingIterator(iter);
		System.out.println("Next: " + obj.next());
		System.out.println("Peek: " + obj.peek());
		System.out.println("Next: " + obj.next());
		System.out.println("Next: " + obj.next());
		System.out.println("Has Next: " + obj.hasNext());
	}

}
