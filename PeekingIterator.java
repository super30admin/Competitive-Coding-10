// Time Complexity : O(1)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	
    private int peekValue;
    private Iterator<Integer> iterator;
    
    public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    peekValue=-1;
        this.iterator=iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peekValue>0) return peekValue;
        else {
            peekValue=iterator.next();
        }
        return peekValue;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(peekValue>0) {
            int nextVal = peekValue;
            peekValue=-1;
            return nextVal;
        }
        return iterator.next();
        
	}
	
	@Override
	public boolean hasNext() {
	    return peekValue>0||iterator.hasNext();
	}
}

