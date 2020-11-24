// Time Complexity : Peek, next, hasNext O(1)
// Space Complexity: O(1)
// Passed Leetcode

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer currValue = null;
    Iterator<Integer> iterator;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
        if (iterator.hasNext())
            currValue = iterator.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return currValue;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer temp = currValue;
        if (iterator.hasNext())
            currValue = iterator.next();
        else
            currValue = null;
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return currValue != null;
	}
}