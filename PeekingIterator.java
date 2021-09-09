//Time Complexity: O(1)
//Space Complexity: O(1)

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer temp = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
        next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = temp;
        if(itr.hasNext()) 
            temp = itr.next(); 
        else
            temp = null;
        
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return temp != null;
	}
}