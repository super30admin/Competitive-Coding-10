// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//if stock on next day in greater than present, then buy on present day and sell it immediately on next day.

class Solution {
		public int maxProfit(int[] prices) {
			// edge case
			if (prices == null || prices.length == 0)
				return 0;
			int peak = prices[0];
			int valley = prices[0];
			int maxProfit = 0;
			int i = 0;
			while (i < prices.length - 1) {
				while (i < prices.length - 1 && prices[i] > prices[i + 1])
					i++;
				valley = prices[i];
				while (i < prices.length - 1 && prices[i] <= prices[i + 1])
					i++;
				peak = prices[i];
				maxProfit += peak - valley;
			}
			return maxProfit;
		}
	}