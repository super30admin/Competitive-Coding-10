// Problem 1 - Peeking Iterator
// Time Complexity: O(1)
// Space Complexity: O(1)

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iterator;
    Integer curr;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) {
            this.curr = iterator.next();
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if (curr != null) {
            return curr;
        }
        
        return null;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if (curr == null) {
            return null;
        }
        
        Integer result = curr;
        if (iterator.hasNext()) {
            curr = iterator.next();
        } else {
            curr = null;
        }
        
        return result;
	}
	
	@Override
	public boolean hasNext() {
	    if (curr == null) {
            return false;
        }
        
        return true;
	}
}

// Problem 2 - Best Time to Buy and Sell Stock II
// Time Complexity: O(n) where n = length of array
// Space Complexity: O(1)

// 1 - initialize 2 variables, one with positive infinity
// 2 - loop over array
// 3 - check if prices is less than buy, then update buy
// 4 - else check if prices is greater than buy, then update profit
// 5 - and update buy
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        // 1
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        // 2
        for (int i=0; i<prices.length; i++) {
            if (prices[i] < buy) { // 3
                buy = prices[i];
            } else if (prices[i] > buy) { // 4
                profit += (prices[i] - buy);
                buy = prices[i]; // 5
            }
        }
        
        return profit;
    }
}
