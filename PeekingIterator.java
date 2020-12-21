package CompetitiveCoding_Dec20;

import java.util.Iterator;

//Java Iterator interface reference:
//https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
	/*
  Space complexity: O(1)
  
  Approach: 
  Using normal iterator next function, store the peeked element in global variable. 
  Whenever next or peek operation is requested again, first check if the global variable has some non-null value. (Because the element in global variable will be the next in sequence of elements in the input iterator). If global variable has null value. then check value to be returned for peek and next calls from the input iterator.
 */
 
 Integer temp;
 Iterator<Integer> it;
 
 public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
     it = iterator;
	    temp = null;
	}
	
 // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
     if (temp != null) {
         return temp;
     }
     if (it.hasNext() == true) {
         temp = it.next();
     }
     return temp;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
     Integer nextRes;
     if (temp != null) {
         nextRes = temp;
         temp = null;
         return nextRes;
     }
     if (it.hasNext() == true) {
         return it.next();
     }
	    return -1;
	}
	
	@Override
	public boolean hasNext() {
	       if (it.hasNext() == true || temp != null) {
         return true;
     }
     return false;
	}
}