TC:O(n)
SC:O(1)
Succesfully run on leetcode


class Solution {
    public int maxProfit(int[] prices) {
        //base
        if(prices.length == 0) return 0;
        int min = prices[0];
        int profit=0;
        //traverse
        for(int i=0;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            if(min<prices[i]){
                profit+= prices[i] - min;
                min = prices[i];
            }
        }
        return profit;
    }
}