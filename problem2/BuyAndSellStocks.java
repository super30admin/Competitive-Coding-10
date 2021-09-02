//Time Complexity : O(n), n -> Number of stock prices
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
package problem2;

public class BuyAndSellStocks {
	public int maxProfit(int[] prices) {
		if (prices.length < 2) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			}
			if (prices[i] - min > profit) {
				profit = prices[i] - min;
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		BuyAndSellStocks obj = new BuyAndSellStocks();
		int[] stocks = { 7, 1, 5, 3, 6, 4 };

		System.out.println("Maximum profit: " + obj.maxProfit(stocks));
	}

}
