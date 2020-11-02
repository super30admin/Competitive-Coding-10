

import java.util.*;

public class peekingIterator implements Iterator<Integer>{
	
	Iterator<Integer> it;
	private Integer next;
	
	// O(1)
	public peekingIterator(Iterator<Integer> iterator) {
		
		// assign the class variables to iterator
		this.it = iterator;
		// initiliaze the next variable with the first element so that if the peek is called first, 
		// we can return the first element
		next = it.next();
		
	}

	// O(1)
	public Integer peek() {
		
		// return the next element which is the peek element
		return next;
		
	}
	
	// O(1)
	@Override
	public Integer next() {
		
		// store the current element into temporary
		Integer temp = next;
		if(it.hasNext()) {
			
			//take the next element
			next = it.next();
			// return the temp since the next will have next element but we need to return the current 
			// next is used when we need to return to peek()
			return temp;
		}else {
			
			// if the iterator is empty, we need to update our next to null
			next = null;
		}
		// return null if the next does not have any value
		return null;
	}
	
	// O(1)
	public boolean hasNext() {
		
		// check if the next is not null, it shows we still have next element pending to check
		if(next != null)
			return true;
		
		// return false if the next is null because we know that there is no next element which means we have already reached end of iterator
		return false;
	}
}
