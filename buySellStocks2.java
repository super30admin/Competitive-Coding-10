//time complexity : O(n)
//space complexity: O(1)
//executed on leetcode: yes
//approach: we keep on checking pairs of stock prices, if the difference is positive(we sell at higher price than the purchase price), we add the difference to the profit

class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int profit = 0;
        for(int i=0;i<prices.length-1;++i)
        {
            if(prices[i]<prices[i+1]) profit+=prices[i+1]-prices[i];
        }
        return profit;
    }
}



