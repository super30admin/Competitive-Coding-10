// Time complexity - O(n)
// space complexity - O(1)
// solved on leetcode - yes
// faced any issues - No
// Iterating through the list and finding the next greater element to sell and getting the profit
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0;i<prices.length-1;i++) {
            if(prices[i] < prices[i+1]) {
                maxProfit = maxProfit + (prices[i+1] - prices[i]);
            }
        }
        return maxProfit;
    }
}
