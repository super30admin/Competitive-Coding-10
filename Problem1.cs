public class Solution
	{
        // Time Complexity : O(n)
        // Space Complexity : O(1) - in place
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public int MaxProfit(int[] prices)
        {
            if (prices == null || prices.Length == 0) return 0;
            int maxProfit = 0;

            int n = prices.Length;
            for (int i = 1; i < n; i++)
            {
                if (prices[i] > prices[i - 1])
                {
                    maxProfit = maxProfit + (prices[i] - prices[i - 1]);
                }
            }
            return maxProfit;
        }
    }
