//Time Complexity: O(N)
//Space Complexity :O(1)
class Solution {
    public int maxProfit(int[] prices) {
        //edge case
        if(prices.length == 1){
            return 0;
        }
        int maxProfit = 0;
        
        for(int i =0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                maxProfit += prices[i+1]- prices[i];   // 7 --> 1, 1--> 5-1
            }
        }
        return maxProfit;
    }
}