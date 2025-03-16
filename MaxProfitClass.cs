// TC => O(n)
// SC => O(1)

public class Solution {
    public int MaxProfit(int[] prices) {
        int totalProfit = 0;
        for(int i = 0; i< prices.Length-1;i++){
            if(prices[i]<prices[i+1]){
                totalProfit += prices[i+1] - prices[i];
            }
        }
        return totalProfit; 
    }
}