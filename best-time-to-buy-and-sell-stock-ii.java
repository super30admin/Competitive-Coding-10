/**
BruteForce Approach : is not clear

Simple On pass Approach:
Time: O(n)
Space: O(1)

**/

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        
        int maxProfit = 0;
        
        /* Idea here is to find the valley and its immediate peak 
           that way we ll get the max profit if we are allowed to carry multiple transaction */
        
        /* Be aware to check if we are using i+1 ==> 
           need to take care of base case which is i<prices.length-1 */
        for(int i=0; i<prices.length-1; i++)
        {
        /** If i < i+1 ==> add it to profit and increment i*/
           if(prices[i] < prices[i+1])
               maxProfit += prices[i+1] - prices[i];
        }
        
        return maxProfit;
    }
}
