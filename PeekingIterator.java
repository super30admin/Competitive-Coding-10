// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//284. Peeking Iterator (Medium) - https://leetcode.com/problems/peeking-iterator/

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> it;
    private Integer nextEl;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
        next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextEl;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer temp = nextEl;
        
        if (it.hasNext()) {
            nextEl = it.next();
        } else {
            nextEl = null;
        }
	    
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return nextEl != null;
	}
}