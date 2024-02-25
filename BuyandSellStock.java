/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/
public class BuyandSellStock {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int profit = 0, minBuy = prices[0];

        for(int index = 0; index < n; index++){
            if(prices[index] > minBuy){
                profit += prices[index] - minBuy;
                minBuy = prices[index];
            } else {
                minBuy = Math.min(minBuy, prices[index]);
            }
        }

        return profit;
    }
}
