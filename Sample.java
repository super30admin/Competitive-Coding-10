//****BUY AND SELL STOCK-2****
//Time complexity: o(n);
//Space complexity:o(1);

class Solution {
    public int maxProfit(int[] prices) {
        int slow=0;
        int fast=1;
        int max=0;
        int profit=0;
        while(fast<prices.length)
        {
            if(prices[slow]>prices[fast])
            {
                //No profit is generated
                slow++;
                fast++;
            }
            
            else if(prices[slow]<=prices[fast])
            {
                profit+=prices[fast]-prices[slow];
                
                slow++;
                fast++;
            }
        }
        return profit;
    }
}
