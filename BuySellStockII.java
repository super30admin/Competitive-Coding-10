/**
 * Leetcode 122. Best Time to Buy and Sell Stock II
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/
 */
//------------------------------------ Solution 1 -----------------------------------
public class BuySellStockII {
    /**
     * Solution needs to calculate local minima and local maxima as buy and sell points. Add
     * proceeds from each buy-sell pair to the total profit. Here local minima/maxima is calculated
     * by looking ahead(next) and looking back(prev)
     *
     * TC: O(n)
     * SC: O(1)
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int prev = Integer.MAX_VALUE;
        int next = 0;

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                next = -1; // any out of bound min value
            } else {
                next = prices[i + 1];
            }
            int curr = prices[i];
            if (curr <= prev && curr < next) { //lower peak hence buy
                profit -= curr;
            } else if (curr > prev && curr >= next) {//higher peak hence sell
                profit += curr;
            }
            prev = curr;
        }
        return profit;
    }
}

//------------------------------------ Solution 2 -----------------------------------
class BuySellStockII2 {
    /**
     * Calculate local minima/maxima by just looking ahead and accordingly make the buy or sell trade
     *
     * TC: O(n)
     * SC: O(1)
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int i = 0;

        while (i < n - 1) {
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            profit -= prices[i]; // buy
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            profit += prices[i];
        }
        return profit;
    }
}