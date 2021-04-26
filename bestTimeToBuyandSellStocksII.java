//TC: O(n)
//SC: O(1)
//check if there is a profit where the prices[i+1] > prices[i] and return the cumulative profit
class Solution {
    public int maxProfit(int[] prices) {
        //sanity check
        if(prices==null || prices.length == 0){
            return 0;
        }
        
        //
        int profit = 0;
        int val = 0;
        int maxPtr = prices.length-1;
        for(int i=0;i<maxPtr;i++){
            if(prices[i]<prices[i+1]){
                val = prices[i+1] - prices[i];
                profit += val;
            }
            
        }
        
        return profit;
    }
}