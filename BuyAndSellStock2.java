//TC: O(n)
//SC: O(1)

// I drew a line graph to see the crest(high) and trough(low).
// I stand one step ahead (i) and check if my (i-1) is high or low,
// If its lower than i then profit else its a loss.
// Meaning if I bought a stock for a price lower than today, its a profit
// For profit I just add it to my total profit
// Here max profit is basically total profit because im only checking the difference between two stocks

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            } else{
              continue;  
            }
        }
        return profit;
    }
}