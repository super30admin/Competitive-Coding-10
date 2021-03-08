
/*

time complexity: O(n)
space complexity: O(1)
*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        int i = 0;
        while(i < prices.length - 1){
            //find the peak
            while(i < prices.length - 1 && prices[i] >= prices[i+1]){
                i++;
            }
            int peak = prices[i];
            
            //find the valley
            while(i < prices.lengthBest-1 && prices[i] <= prices[i+1]){
                i++;
            }
            int valley = prices[i];
            
            maxProfit += valley - peak;
            
        }
       return maxProfit;
    }
}
