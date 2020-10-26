// Time Complexity : O(1)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class PeekingIterator implements Iterator<Integer> {
    Integer nextVal;
    boolean isPeeked;
    Iterator<Integer> iter;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        nextVal=null;
        isPeeked=false;
        iter = iterator;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!isPeeked){
            if(iter.hasNext()){
                nextVal=iter.next();
                isPeeked=true;
            }
        }
        return nextVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(isPeeked){
            isPeeked=false;
            return nextVal;
        }
        else{
           return iter.next();
        }
	}
	
	@Override
	public boolean hasNext() {
	    return iter.hasNext()|| (isPeeked&&!iter.hasNext());
	}
}