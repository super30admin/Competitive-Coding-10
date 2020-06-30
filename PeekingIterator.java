
import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    
    private Iterator<Integer> iterator;
    private Integer peekVal;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(peekVal == null) {
            if(!iterator.hasNext())
            {
                throw new NoSuchElementException();
            }
            peekVal = iterator.next();
        }
        return peekVal;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(peekVal != null) {
            Integer temp = peekVal;
            peekVal = null;
            return temp;
        }
        
        if(!iterator.hasNext())
        {
            throw new NoSuchElementException();
        }
	    return iterator.next();
	}
	
	@Override
	public boolean hasNext() {
	    if(peekVal != null || iterator.hasNext()) {
            return true;
        }
        return false;
	}
}