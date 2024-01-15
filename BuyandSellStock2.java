// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

public class BuyandSellStock2 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }

    
    public static void main(String[] args) {
      
        int[] examplePrices = {7, 1, 5, 3, 6, 4};
        BuyandSellStock2 solution = new BuyandSellStock2();

        int maxProfit = solution.maxProfit(examplePrices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
