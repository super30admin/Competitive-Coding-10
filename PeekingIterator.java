// Time Complexity : O(1) 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// initialize peek to null, check if iterator has next, if yes set to peek
// as long as peek!=null return peek and say hasNext == True

class PeekingIterator implements Iterator<Integer> {
    Integer peek=null;
    Iterator<Integer> iterator;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    peek = iterator.next();   
        this.iterator = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return peek;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer next = peek;
        if(iterator.hasNext()){
            peek = iterator.next();    
        }
        else{
            peek = null;
        }
        
        return next;
	}
	
	@Override
	public boolean hasNext() {
	    return peek!=null;
	}
}