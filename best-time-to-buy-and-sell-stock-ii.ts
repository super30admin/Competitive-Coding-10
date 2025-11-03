// Time Complexity: O(n)
// Space Complexity: O(1)
function maxProfit(prices: number[]): number {
	let profit = 0;
	let n = prices.length;

	for (let i = 0; i < n - 1; i++) {
		// since there's no limit on transaction, we take profit whever the prices go up
		if (prices[i] < prices[i + 1]) {
			profit += prices[i + 1] - prices[i];
		}
	}
	return profit;
}
