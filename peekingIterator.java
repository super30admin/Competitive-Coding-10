// Time Complexity : O(1)
// Space Complexity :O(1)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;
    private Integer peeked = null;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter= iterator; 
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peeked==null){
            if(!iter.hasNext()){
                throw new NoSuchElementException();
            }
            peeked =iter.next();
        }
        return peeked;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(peeked!=null){
            Integer val= peeked;
            peeked= null;
            return val;
        }
        
        if(!iter.hasNext()){
                throw new NoSuchElementException();
        }
        
        return iter.next(); 
	}
	
	@Override
	public boolean hasNext() {
	    return peeked!=null || iter.hasNext();
	}
}