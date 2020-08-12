// Time Complexity - O(n)
// Space complexity - O(1)

class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxProfit = 0;
        int i = 0;
        while(i < prices.length - 1){
            
            while( i < prices.length - 1 && prices[i] >= prices[i+1]){
                i++;
            }
            valley = prices[i];
            while(i < prices.length - 1 && prices[i] <= prices[i+1]){
                i++;
            }
            peak = prices[i];
            maxProfit += peak - valley;            
        }
        return maxProfit;
    }
    
}
