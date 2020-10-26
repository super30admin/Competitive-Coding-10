    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/peeking-iterator/
    Time Complexity for operators : o(1) 
    Extra Space Complexity for operators : o(1)
    Did this code successfully run on Leetcode : NA
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : 
        # Optimized approach: 
                              
            # 1. 
                    A) Create a store variable and object of Iterator.
                    B) Initially, store the first value into Store variable.
                    C) In next(), store variable into temp and call itr.next() if it has next element else put null in it.
                        return temp in next() function.
                    D) peek(), return the value of store.
                    E) hasNext(), check the value of store if it  is not null  then return true else false.
    */  
    
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Integer store;
    Iterator<Integer> itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.store = iterator.next();
        this.itr = iterator;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return store;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        
        Integer temp = store;
        
        if(itr.hasNext())
            store = itr.next();
        else
            store = null;
        
        return temp;
	    
	}
	
	@Override
	public boolean hasNext() {
	    return (store != null);
	}
}