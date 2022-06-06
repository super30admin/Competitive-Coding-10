public class BestTimeBuySellStock {

    // LeetCode # 121
    // TC : O(n)
    // SC :O(1)
    public int maxProfit_I(int[] prices) {

        int max=0,min=prices[0];
        for(int i=1;i<prices.length;i++)   {

            if(min<prices[i])
                max=Math.max(prices[i]-min,max);
            else
                min=prices[i];
        }
        return max;
    }

    // LeetCode #122
    // Greedy approach
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;

        int profit = 0;
        for(int i=1; i < prices.length; i++){
            if(prices[i-1] < prices[i]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}
