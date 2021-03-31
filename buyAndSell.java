// Time complexity - O(n)
// Space complexity - O(1) - constant
// works on leetcode

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int total = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1] < prices[i]){
                total = total + (prices[i] - prices[i-1]);
            }
        }
        return total;
    }
}
