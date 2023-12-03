// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: None

// Your code here along with comments explaining your approach

class BuyAndSellStockII {
    int sum =0;
    public int maxProfit(int[] prices) {
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-prices[i-1];
            if(profit>0){
                sum+=profit;
            }
        }
        return sum;
    }
}