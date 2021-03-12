//Problem 132: Peeking Iterator
//TC:O(n)
//SC:O(1)

/*
Steps: 1) Initialise a variable called nextElem and iteartor.Map the iterator with the input iterator.
       2) In constructor just chech whether the itereator has next value or not, if it has,then just assign it to the nextElem variable using iterator.next and iterator will move forward.
       3) For peek just return the nextElem
       4) For next, here we have to update nextElem value. Therefore, first assign nextElem to the other variable called val and then check whether iterator has Next value or not. If it has, then just update the nextElem otherwise make nextElem to null;
       5) For hasNext, just check nextElem is not null or iterator has next value or not. 
*/


// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
import java.util.*;
class PeekingIterator implements Iterator<Integer> {

    private Iterator<Integer> itr;
    private Integer nextElem;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        itr = iterator;
        if(itr.hasNext()) 
             nextElem = itr.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
    //TC:O(1)
	public Integer peek() {
       
        return nextElem;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
    //TC:O(1)
	@Override
	public Integer next() {
	    int val = nextElem;
        if(itr.hasNext()){
           nextElem = itr.next();  
        }else{
            nextElem = null;
        }
        
        return val;
	}
	
	@Override
    //TC:O(1)
	public boolean hasNext() {
	    return nextElem!=null || itr.hasNext();
	}
    
}