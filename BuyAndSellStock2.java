//TC:O(n)
//SC:O(1)

class Solution {
    public int maxProfit(int[] prices) {
        //null case
        if( prices == null || prices.length == 0) return 0;
        
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){    //checking curr day prices with previous day prices
                profit = profit + (prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}