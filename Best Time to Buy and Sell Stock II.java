// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxProfit(int[] prices) {
        int sum =0;    
        for(int i=1; i<prices.length; i++){
            //iterate through the the prices array
            //whenever the stock is greater than the previous
            //add the difference to the sum
            if(prices[i]> prices[i-1]){
                sum= sum + (prices[i] - prices[i-1]);
            }  
        }
        return sum;
    }
}