// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    public int maxProfit(int[] prices) {
        //edge case
        if(prices==null || prices.length==0)
            return 0;
        int profit = 0;
        //iterate over the prices
        for(int i=0;i<prices.length;i++)
        {
            //whenever we find a difference such that the price increases
            if(i<prices.length-1 && prices[i] < prices[i+1])
                profit+= prices[i+1] - prices[i]; // add the diff to profit
            
        }
        
        return profit;
    }
}

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> it;
    Integer value; 
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        it = iterator;
        value = null;
        
        if(it.hasNext())
        {
            value = it.next(); // storing next value globally in constructor
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return value; // return the next value stored
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        //we need to return the value stored in global variable but we also need to move the pointer to next value for next call
	    Integer temp = value;  //storing value to be returned
        if(it.hasNext())
            value = it.next(); //updating the value
        else
            value = null; 
        return temp;
	}
	
	@Override
	public boolean hasNext() {
        // if value exists we return true
	    if(value!=null)
            return true;
        else
            return false;
	}
}