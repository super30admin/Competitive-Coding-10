Time Complexity = O(n)
Space Complexity = O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        if(prices.length == 1){
            return 0;
        }
        
        for(int i = 0; i < prices.length-1; i++){
            // 7 1 5 3 6 4
            
            int temp = 0;
            if(prices[i] > prices[i+1]){
                continue;
            }else{
                temp = prices[i+1] - prices[i];
                maxProfit += temp;
                
            }          
        }
        
        return maxProfit;
        
        
    }
}