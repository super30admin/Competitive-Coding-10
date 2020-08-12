/**
 * Time Complexity : O(1) all operations
 * Space Complexity : O(1)
 */
import java.util.*;
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer cache;
	public PeekingIterator(Iterator<Integer> iterator) {
	    itr = iterator;
        cache = itr.next();                                                                                         
	}
	
	public Integer peek() {
        return cache;                                                                                                  
	}
	
	@Override
	public Integer next() {
        Integer val = cache;
        if(itr.hasNext()){
            cache = itr.next();                                                                             
        } else {
            cache = null;                                                                                       
        }   
	    return val;
	}
	
	@Override
	public boolean hasNext() {
	    return cache != null;                                                                                   
	}
}