// TC: O(n)
// SC: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int share=prices[0];
        
        for(int i=1;i<prices.length;i++){
            share=Math.min(share,prices[i]);
            if(share<prices[i]){
                profit=Math.max(profit,prices[i]-share);
            }
        }
        return profit;
    }
}
