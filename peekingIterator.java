// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode :yes
//Any problem you faced while coding this : no

class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> iter;
    Integer peekedValue;
    boolean flag;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    iter = iterator;
        peekedValue = null;
        flag = false;
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        
       if(peekedValue == null){
           
        if(iter.hasNext()){
        peekedValue = iter.next();
        //return peekedValue;
        }
           
       }
         return peekedValue;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    
        Integer current = peek();
        peekedValue = null;
        return current;
	}
	
	@Override
	public boolean hasNext() {
	    
        return peekedValue != null || iter.hasNext();
	}
}