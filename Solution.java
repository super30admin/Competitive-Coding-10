//Time: O(n)
//Space: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        
        int result = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1])
                result = result + (prices[i] - prices[i-1]);
        }
        
        return result;
    }   
}
