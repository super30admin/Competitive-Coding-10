// Time complexity:O(n)
//space complexity:O(1)

class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int profit=0;
        int sell=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                sell=prices[i+1]-prices[i];
                profit+=sell;
            }
        }
        return profit;
        
        
    }
}
