// TC - O(n), SC - O(1)

// LC - 122

class Solution {
    public int maxProfit(int[] prices) {
		// Initialize a variable to 0
        int profit = 0;
		// Iterate over prices array
        for(int i=1; i<prices.length; i++){
			// If current value is greater than previous value, add it to profit
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
		// return profit
        return profit;
    }
}