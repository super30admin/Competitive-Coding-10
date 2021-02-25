/*
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices is None or len(prices) == 0:
            return 0
        
        valley = 0
        peak = 0
        i = 0
        max_sum = 0
        while i < len(prices)-1:
            
            while i < len(prices)-1 and prices[i] >= prices[i+1]:
                i += 1

            valley = prices[i]

            while i < len(prices)-1 and prices[i] <= prices[i+1]:
                i += 1

            peak = prices[i]

            max_sum += peak - valley
        return max_sum  
*/
// time - O(n)
// space - O(n)
// logic - whenever there is valley its time to buy and whenever there is peak its time to sell
class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;
        
        int max = 0, valley = 0, peak = 0, i = 0;
        
        while (i < prices.length - 1){
            while (i < prices.length - 1 && prices[i] >= prices[i+1]){
                i++;
            }
            valley = prices[i];
            
            while (i < prices.length - 1 && prices[i] <= prices[i+1]){
                i++;
            }
            peak = prices[i];
            max += peak - valley;
        }
        return max;
    }
}