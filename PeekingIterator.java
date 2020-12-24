// Time Complexity :  O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer curr = null;
    Iterator<Integer> iterator;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        if(iterator.hasNext()){
            curr = iterator.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return curr;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer temp = curr;
        if(iterator.hasNext()){
            curr = iterator.next();
        }
        else{
            curr = null;
        }
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return curr != null;
	}
}