//Problem 1 Peek iterator
// Time Complexity :O(1)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Keep an global iterator and current element, return current element in peek, current points at next element.
class PeekingIterator implements Iterator<Integer> {
	Iterator<Integer> iterator;
	int cur;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator=iterator;
		this.cur=iterator.next();
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return cur;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
			int x = cur;
        if (iterator.hasNext())
            cur = iterator.next();
        else
            cur = 0;
        return x;
	}
	
	@Override
	public boolean hasNext() {
	    return cur!=0;
	}
}


//Problem 2 Best time to buy and sell stock 2
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//plot a line graph and only consider positive slopes in our profit. because that would be the max profit one gets. 
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        // int minPrice = Integer.MAX_VALUE;
        // for (int i = 0; i < prices.length; i++) {
        //     minPrice = Math.min(minPrice, prices[i]);
        //     if (prices[i] - minPrice > 0) {
        //         profit += prices[i] - minPrice;
        //         minPrice = prices[i];
        //     }
        // }
        // return profit;

        for(int i=1;i<prices.length;i++){
            if(prices[i-1]<prices[i]){
                profit+=prices[i]-prices[i-1];
            }
        }
        return profit;
    }
}