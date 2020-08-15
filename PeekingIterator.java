//Time Complexity: 1. Peek() - O(1), 2. Next() - O(1) 3. HasNext() -O(1)
//Space Complexity: O(1), no extra space used

class PeekingIterator implements Iterator<Integer> {
    //Place holders
    Iterator<Integer> itr; //implementing iterator class so we can declare it globally
    Integer next; // Variable to store current next
    boolean isDone; // to check the last element in an array
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here. 
        //Constructor
	    itr = iterator;
        if(itr.hasNext()){ // to compute peek and next
            next = itr.next();
            isDone = false;
        }else{
            next = null;
            isDone = true;
        }        
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return next;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int val = next;
        if(itr.hasNext()){ // to compute peek and next
            next = itr.next();
            isDone = false;
        }else{
            next = null;
            isDone = true;
        }        
	    return val;
	}
	
	@Override
	public boolean hasNext() {
	    return !isDone;
	}
}