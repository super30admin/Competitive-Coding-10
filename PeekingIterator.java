package competitiveCoding10;

import java.util.Iterator;

public class PeekingIterator implements Iterator<Integer>{
	Iterator<Integer> itr;
    Integer var = null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.itr = iterator;
        if(itr.hasNext())
            var = itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return var;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int num = var;
        if(itr.hasNext())
            var = itr.next();
        else
            var = null;
        
        return num;
	}
	
	@Override
	public boolean hasNext() {
	    return var != null || itr.hasNext();
	}
}
