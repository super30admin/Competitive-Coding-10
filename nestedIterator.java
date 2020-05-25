// Time Complexity :O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer currentElement;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
        currentElement = null;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(!hasNext()) throw new NoSuchElementException();
        return currentElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(!hasNext())
        {
           throw new NoSuchElementException();
        }
        int temp = currentElement;
        currentElement =null;
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    if(it.hasNext() && currentElement==null)
        {
            currentElement = it.next();
            return true;
        }
        else if(currentElement!=null)
        {
            return true;
        }
        else return false;
	}
}