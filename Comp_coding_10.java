//# Competetive-Coding-10

import java.util.Iterator;
//time complexity: O(n)
//space complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int start; int sum = 0;
        for(int i=0; i < n-1; i++) {
            if(prices[i] < prices[i+1]) {
                sum += (prices[i+1]- prices[i]);
            }
        }
        return sum;
    }
}


//time complexity: O(1)
// space complexity: O(n) for storing the next element in the iterator

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    
    Iterator<Integer> it;
    Integer nextElement;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    it = iterator;
        if(it.hasNext())
            nextElement = it.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return nextElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    Integer val = nextElement;
        if(it.hasNext())
            nextElement = it.next();
        else nextElement = null;
        return val;
	}
	
	@Override
	public boolean hasNext() {
	    return (nextElement != null);
	}
}