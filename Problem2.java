//Time Complexity: O(n); where n is the length of prices
//Space Complexity: O(1)
//Code run successfully on LeetCode.

public class Problem2 {

    public int maxProfit(int[] prices) {
        
        int i =0;
        int n = prices.length;
        int maxProfit = 0;
        
        int peak = prices[0];
        int valley = prices[0];
        
        while(i < n-1)
        {
            
            while(i <n-1 && prices[i] >= prices[i+1])
                i++;
             valley = prices[i];
            
            while(i <n-1 && prices[i] <= prices[i+1])
                i++;
            peak = prices[i];
            
            maxProfit += peak-valley;
        }
        
        return maxProfit;
    }
}
