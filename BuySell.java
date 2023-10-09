// TC : O(n)
// SC : O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int diff =0;
        int profit =0;
        for(int i=1; i<prices.length;i++){
            diff = prices[i] - prices[i-1];
            if(diff > 0){
                profit += diff; 
            }
        }
        return profit;
    }
}
