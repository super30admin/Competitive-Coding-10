// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> iter; 
	int prev=0 ;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator; 
			if(iter.hasNext()){
					prev = iter.next();
			}
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return prev;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int temp = prev; 
			if(iter.hasNext())
				prev = iter.next();
			else 
				prev = 0;
			return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return prev != 0;
	}
}