//TC - O(N)
//SC - O(1)
class Solution {
	public int maxProfit(int[] prices) {
		// edge
		if (prices == null || prices.length == 0)
			return 0;
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				profit += prices[i + 1] - prices[i];
			}
		}
		return profit;
	}
}