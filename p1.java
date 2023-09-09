// Time Complexity :next hasnext and peek would be O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> it;
	Integer nextEl;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(nextEl == null){
			if(it.hasNext()){
				nextEl = it.next();
			}
		}
		return nextEl;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(nextEl == null){
			if(it.hasNext()){
				nextEl = it.next();
			}
		}
	    Integer res = nextEl;
		if(it.hasNext()) nextEl = it.next();
		else nextEl = null;
		return res;
	}
	
	@Override
	public boolean hasNext() {
	    if(nextEl == null){
			if(it.hasNext()){
				nextEl = it.next();
			}
		}

		return !(nextEl == null);
	}
}