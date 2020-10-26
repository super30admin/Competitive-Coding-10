// Time Complexity : O(n) n is number of elements in the input array
// Space Complexity : O(1) constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Compare the adjacent value starting from 1st index.
// if the current element is greater than the previous element, add the difference to the profit.
// return the profit calculated.



class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length == 0) {
            return 0;
        }
        int profit = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] > prices[i-1]){
                profit+=prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}