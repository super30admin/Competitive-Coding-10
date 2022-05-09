//Time Complexity O(N)
//Space Complexity O(1)
//Leetcode tested

public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int pd = prices.length-1;
        int result=0;
        while(pd>=1){
            if(prices[pd] - prices[pd-1] >  0){
                result+=prices[pd] - prices[pd-1];
            }
            pd--;
        }

        return result;
    }
}
