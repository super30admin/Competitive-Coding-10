
/*
 *  The Time complexity of the algorithm is O(n)) where n is no of elements in array.
 *  Space complexity of the algorithm is O(1) .
 */

public class BestTimetoBuyandSellStockII {

	public int maxProfit(int[] prices) {

		if (prices.length == 0)
			return 0;

		int valley = prices[0];
		int peek = prices[0];
		int maxProfit = 0;
		int i = 0;
		while (i < prices.length - 1) {

			while (i < prices.length - 1 && prices[i] >= prices[i + 1])
				i++;

			valley = prices[i];

			while (i < prices.length - 1 && prices[i] <= prices[i + 1])
				i++;

			peek = prices[i];

			maxProfit += peek - valley;
		}

		return maxProfit;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
