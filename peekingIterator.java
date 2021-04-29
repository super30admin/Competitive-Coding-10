// Time Complexity : O(1) for peek , next,hasNext()
// Space Complexity :  O(1) for peek , next,hasNext()
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
  Iterator<Integer> iterator ;
  Integer val;
  int point = 0;
  boolean check = false;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
    this.iterator = iterator;
    
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
    //that means we have done a peek() before and can return the val
    if(point == 1)
    {
      return val;
    }
    //whenever we do peek use the .next() or iterator and assign it to val . Make the variable point as 1 so that if we do a peek again we can directly return the val
    else
    {
      //get the value and assign to val
      val = iterator.next();
      //save the .hasNext() in a boolean variable
      check = iterator.hasNext();
      //make the point variable as one to store the condition that we have used the peek method once which used the .next and .hashNext()
      point = 1;
      return val;
    }
    
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
    //we have used the peek before so make the point as 0 and return the val that we saved before
    if(point == 1)
    {
      point = 0;
      return val;
    }
    //in case when peek was not used for the same elemenet and use the regular .next()
    else
    { 
     // point = 0;
      return iterator.next();
    }
       
	}
	
	@Override
	public boolean hasNext() {
    //idicating we have already done  a peek 
    if(point == 1)
    {
      check = true;
      return check;
    }
    //peek was not done earlier
    else
    {
      check = false;  
      return iterator.hasNext();
    }
	}
}