//Time Complexity : O(1)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    //keep a variable to store the current value before going to next
    Integer store = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
        //store the first value
        if(itr.hasNext()){
            store = itr.next();
        }
	    else{
            store = null;
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        //return the stored value
        return store;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = store;
        //go to next
        if(itr.hasNext()){
            //store the next value
            store = itr.next();
        }
        else{
            store =null;
        }
        //return the current value
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return store!=null || itr.hasNext();
	}
}