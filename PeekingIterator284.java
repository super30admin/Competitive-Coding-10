// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.NoSuchElementException;

class PeekingIterator implements Iterator<Integer> {
    
    // Obs: We only have next() which removes element from the structure
        // Inorder to just peek, we are storing in a variable, peek
        // This impacts the next() and hasNext() since we already got an element
    
    // Obs2: defining new datastructure and copying elements will work but 
    // TC and SC will be O(n) for both.
    
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    
    
    private Iterator<Integer> iter;
    private Integer peek = null;
    
    //Queue<Integer> queue; --> Iterator itself refers to a structure already
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        iter = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        // We only have next() which removes element from the structure
        // Inorder to just peek, we are storing in a variable
        
        if(peek == null){
            if(!iter.hasNext()){
                throw new NoSuchElementException();
            } else 
                peek = iter.next();
        }
        return peek;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        
        // Since we stored peek value --> need to return that first
        // if peek is null -> get next() from the iterator, which is iter.next();
        // to get next --> need to check with hasNext()
        if(peek != null){
            Integer temp = peek;
            peek = null;
            return temp;
        }
        
        if(!iter.hasNext())
            throw new NoSuchElementException();
        
        return iter.next();
	}
	
	@Override
	public boolean hasNext() {
        // when peek is not null ==> we already got one element from iterator
	    return peek != null || iter.hasNext();
	}
}