/**
 * Time Complexity : O(n) where n is the number of prices in the array
 * Space Complexity : O(1)
 */
public class BuySellStocks{
    public int maxProfit(int[] prices) {
        int diff  = 0,i=0;
        if(prices == null || prices.length == 0){return 0;}                                                
        while(i < prices.length-1){
            while(i < prices.length-1 && prices[i] >= prices[i+1])                                                      
                i++;
            int valley = prices[i];
            while(i < prices.length-1 && prices[i] <=  prices[i+1])                                     
                i++;
            int peak = prices[i];
            diff += peak - valley;                                                                      
        }
        return diff;
    }
}