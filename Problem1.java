class Problem1 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i = 0; i < n; i++){
            if(i == n - 1)
                break;
            if(prices[i+1] > prices[i]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}