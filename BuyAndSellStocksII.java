// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
/*Approach:
1) In this question we can execute the transactions multiple times and we need to calculate the max profit.
2) we need to take care is we can only sell one stock before buying it again
3) Thus to execute we start with a very linear approach and start with the loop with i=1
4) simply to access the previous element
-> we just compare the current cost of stock with its previous value and if the diff is >0 then we just add the diff to the maxProfit
This way we can calculate the maxprofit found at every interval

*/

class BuyAndSellStocksII {
    public int maxProfit(int[] prices) {
        
        int maxProfit =0;
        
        if(prices ==null || prices.length==0)
        {
           return maxProfit;
        }
        
        
        // start with next element
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                maxProfit += prices[i]-prices[i-1];
            }
            
            
        }
        
        
        return maxProfit;
    }
}
