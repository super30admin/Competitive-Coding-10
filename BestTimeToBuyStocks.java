//Tc : O(N) - Iterating over prices array
//SC : O(1)

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 0)    return 0;
        int i = 0;
        
        int val = prices[0];
        int max = prices[0];
        
        int maximumProfit = 0;
        int n = prices.length; 
        while(i < n - 1){
            while(i < n - 1 && prices[i] >= prices[i + 1]){ // Loop until curr index stock price is greater then its next one
                i++;
            }
            val = prices[i]; // Calculate for buying
            
            while(i < n - 1 && prices[i] <= prices[i + 1]){ // Loop until curr index stock price is less then its next one
                i++;
            }
            max = prices[i]; // Calculate for Selling
            
            maximumProfit += ( max - val );
        }
        
        return maximumProfit;
        
    }
}           