//Time Complexity = O(N)
//Space Complexity = O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        // int curr;
        //[7,1,5,3,6,4]
        for(int i = 1; i< prices.length ; i++){
            if(prices[i-1] < prices[i]) maxprofit += prices[i] - prices[i-1];

        }
        return maxprofit;
    }
}