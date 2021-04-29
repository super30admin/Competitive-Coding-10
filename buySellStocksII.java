// Time Complexity : O(n) where n is the number of elemetns in prices
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class Solution {
    public int maxProfit(int[] prices) {
      int profit  = 0;
      //sanity check
      if(prices == null || prices.length==0)
       
      {
        return profit;
      }
      
      for(int i = 0;i<prices.length-1;i++)
      {
        if(prices[i+1]>prices[i])
        {
          profit += prices[i+1] - prices[i];
        }
      }
        return profit;
    }
}