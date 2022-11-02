// Time Complexity : O(n^n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int profit = 0;
        
        //start with index 1and compare the price with previous day price to calculate the profit if it exists
        for(int i = 1; i < n; i++)
        {
            if(prices[i] > prices[i-1])
            {
                profit += (prices[i] - prices[i-1]);
            }        
        }
        return profit;
    }
}


// Time Complexity : O(1)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> itr;
    Integer value;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.itr = iterator;
        this.value = itr.hasNext() ? itr.next() : null;
	   
	}
    
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return value;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    int temp = value;
        this.value = itr.hasNext() ? itr.next() : null;
        return temp;
	}
	
	@Override
	public boolean hasNext() {
	    return value !=null;
	}
}