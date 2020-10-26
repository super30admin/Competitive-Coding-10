// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
//Time-O(1)
//Space-O(1)
import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    Integer next_val=null;
    Iterator<Integer> itr;
    boolean nextCheck;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.i
        itr=iterator;
        next_val=itr.next();
        
        
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next_val;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
         Integer temp=next_val;

        next_val=itr.hasNext()?itr.next():null;
        return temp;
	    
	}
	
	@Override
	public boolean hasNext() {
         
        return next_val!=null;
	    
	}
}
