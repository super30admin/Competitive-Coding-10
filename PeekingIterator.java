/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(1)
* 
* Space Complexity: O(1)
* 
*/

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    Integer element;

    Iterator<Integer> localIterator;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.localIterator = iterator;

        placeNextElement();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(element==null){
           placeNextElement();
        }

        return element;
	}

    private void placeNextElement(){
        if(localIterator.hasNext()){
            element = localIterator.next();
        }
    }
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer result = element;

        element = null;

	    placeNextElement();

        return result;
	}
	
	@Override
	public boolean hasNext() {
	    return element != null;
	}
}