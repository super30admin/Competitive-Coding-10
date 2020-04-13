// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
/*
Time and space: O(1)
Approach:
========
Store value somewhere whenever next() is called so that peek() always returns that value
*/
class PeekingIterator implements Iterator<Integer> {
    private Integer val; //null
    private Iterator<Integer> it; 
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.it = iterator;   
        if(it.hasNext()) 
            val = it.next(); 
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return val; 
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int temp = val;
	    if(it.hasNext()) 
            val = it.next(); 
        else
            val = null;
        return temp; 
	}
	
	@Override
	public boolean hasNext() {
	    if(val == null)
            return false; 
        else
            return true;
	}
}

/*
*/