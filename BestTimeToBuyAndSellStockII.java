class BestTimeToBuyAndSellStockII {

    // Time Complexity: O(n)    (where n -> length of prices array)
    // Space Complexity: O(1)
    
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int profit = 0;
        int n = prices.length;
        for(int i = 0; i < n - 1; i++){
            if(prices[i] < prices[i+1])
                profit += prices[i+1] - prices[i];
        }
        return profit;
    }
}