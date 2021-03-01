class Solution {
  
    /*
      Time : O(N)  | One iteration for calculating next highest number, another for calculating profit.
      Space : O(N) | To store nextHighest stock price.
      Leetcode : YES
     */
  
    /*
      Approach
      to maximise the profit, we need to buy at lowest cost and sell at next available highest price.
      to see what would be next highest possible stock price we start from end and see which is the next element
      higher than current price. 
      
      after that go through initial array and check if we buy at current price and sell at next highest price are we making profit
      if yes then add it to the profit.
    */
    public int maxProfit(int[] prices) {      
        if(prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[] nextMax = new int[n];
        int currMax = Integer.MIN_VALUE;
        nextMax[n - 1] = prices[n - 1];
        
        for(int i = n - 2; i >=0; i--){
            nextMax[i] = Math.max(prices[i], prices[i+1]);
        }
        
        int profit = 0;
        for(int i =0; i < n - 1; i++){
            int prof = nextMax[i] - prices[i];
            if(prof > 0){
                profit += prof;
            }
        }
        
        return profit;
    }
}
