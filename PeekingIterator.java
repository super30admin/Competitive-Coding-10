// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

//TC : O(1) for peek(), next(), hasNext()

//SC : O(1)


class PeekingIterator implements Iterator<Integer> {
    Integer curr;
    Iterator<Integer> itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr = iterator;
        curr = itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return curr;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer i = curr;
        if(itr.hasNext())
            curr = itr.next();
        else
            curr = null;
            return i;
	}
	
	@Override
	public boolean hasNext() {
	    return curr != null;
	}
}