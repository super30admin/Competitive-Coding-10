//Leetcode : 284. Peeking Iterator
//Time Complexity: 1. Peek() - O(1), 2. Next() - O(1) 3. HasNext() -O(1)
//Space Complexity: O(1), no extra space used
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> itr;
    Integer p=null;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr= iterator;
        if(itr.hasNext()) p= itr.next();        
	}	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
      return p;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int n = p;
        if(itr.hasNext()) {
            p= itr.next();
        }
        else{
            p=null;
        }
        return n;
	}
	
	@Override
	public boolean hasNext() {    
	    return p!=null;
	}
}