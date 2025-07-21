// Time O(1) for all operations
// Space O(1) for all operations
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    int peek;
    boolean hasN = true;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        it = iterator;
        if(it.hasNext()){
            peek = it.next();
        }else hasN = false;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(hasN) return peek;
        return -1;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int result = peek;
        if(it.hasNext()){
            peek = it.next();
        }else hasN = false;
        return result;
	}
	
	@Override
	public boolean hasNext() {
	    return hasN;
	}
}
