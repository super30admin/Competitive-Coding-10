//Time complexity: peek(): O(1), next(): O(1), hasNext(): O(1)
//Space complexity: peek(): O(1), next(): O(1), hasNext(): O(1)
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer next = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer nextValue = next;
        next = null;
        if(iterator.hasNext()) {
            next = iterator.next();
        }
        return nextValue;
	}
	
	@Override
	public boolean hasNext() {
	    return next != null;
	}
}