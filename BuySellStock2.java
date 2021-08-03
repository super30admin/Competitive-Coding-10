// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class BuySellStock2 {
	public int maxProfit(int[] prices) {

		int i = 0;
		int n = prices.length;
		int profit = 0;

		while (i < n - 1) {

			while (i < n - 1 && prices[i] >= prices[i + 1]) {
				i++;
			}
			int valley = prices[i];

			while (i < n - 1 && prices[i] <= prices[i + 1]) {
				i++;
			}
			int peak = prices[i];
			profit += peak - valley;
		}

		return profit;
	}
}
