# Competetive-Coding-10
//time O(n), space O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit =0;
        for ( int i =1; i < prices.length; i++)
        {
            if ( prices[i]> prices[i-1])
            {
                maxprofit += prices[i] - prices[i-1];
            }
        }
        return maxprofit ;
    }
}

//time O(1) for peek, next, hasNext, space O(1)
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    Integer prev;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iter = iterator;
        if(iter.hasNext())
        {
            prev = iter.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return prev;
        
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        int curr;
        if(prev == null)
         {
            throw new NoSuchElementException();
         }
         curr = prev;
         prev = null;
         if (iter.hasNext()) {
            prev = iter.next();
          }
        return curr;
        
	}
	
	@Override
	public boolean hasNext() {
        if(prev != null)
            return true;
        return false;
	    
	}
}