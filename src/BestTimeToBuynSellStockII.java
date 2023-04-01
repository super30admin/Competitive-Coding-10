//Time Complexity : O(N)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

/**
 * To get the profit, iterate from 1 to n and do the difference of current
 * element with its previous element and if the difference is greater than 0,
 * then add it to the profit and finally return the profit.
 *
 */
class Solution {
	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			int diff = prices[i] - prices[i - 1];
			if (diff > 0)
				profit += diff;
		}
		return profit;
	}
}
