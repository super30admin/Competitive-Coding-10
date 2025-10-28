// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
/*
284. Peeking Iterator
Ran on leetcode: Yes
TC: O(1)
SC: O(1)
In next cache the nextEl value and then update it and return the previous cached value, in peeking iterator we are always one step ahead in next. In peek return the nextEl value which we updated in next.
*/

class PeekingIterator implements Iterator<Integer> {

    Integer nextEl;
    Iterator<Integer> it;

	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;
        this.nextEl = it.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextEl;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer temp = nextEl; // save the previous value in next
        nextEl = null;
        if(it.hasNext()){ // check if there is next element
            nextEl = it.next(); // update the nextEl
        }
        return temp; // return the previous value
	}
	
	@Override
	public boolean hasNext() { // check if there is next element
	    return nextEl != null;
	}
}