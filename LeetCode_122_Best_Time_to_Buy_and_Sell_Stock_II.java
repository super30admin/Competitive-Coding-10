//approach -
//When it's rising , keep adding the sum to profit, when it's valley dont do anything. 
//so we compare i and i-1st value, if ith > i-1th , it's rising and add to sum. 
//TC - O(n), SC - O(1)

class Solution {
    public int maxProfit(int[] prices) {
        //[1,3,5,7,4, 6]
    
        if(prices == null || prices.length ==0)
            return 0;
        
        int profit =0;
       
        for(int i=1; i<prices.length; i++)
        {
            if(prices[i] > prices[i-1])
            {
                profit = profit + prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}