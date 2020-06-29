// Time Complexity : O(1) all operations
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Edge Cases 
/* Your code here along with comments explaining your approach: The iterator starts with keeping the first element in the case if someone peeks at the start.
Keep the cache and return it whenever peek is called. When the next() is called, put the cache in local temporary value variable and return that. Since
pointer moves, update the cache since peeking should seek the next value. At the end, put cache as null since no more values are there to return.
*/
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer cache;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr = iterator;
        cache = itr.next();                                                                                         // Store with the first element
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return cache;                                                                                                   // Return cache till now
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer val = cache;
        if(itr.hasNext()){
            cache = itr.next();                                                                             // Move to the next position and store the cache into local variable
        } else {
            cache = null;                                                                                       // For the last element, nothing is there after that to peek
        }   
	    return val;
	}
	
	@Override
	public boolean hasNext() {
	    return cache != null;                                                                                   // Cache is filled or not
	}
}