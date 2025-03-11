/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Did this code successfully run on Leetcode: Yes
 * Any problem you faced while coding this: None

 * Approach:
 * Iterate through the array from day 0 to n-1 (n = prices.length).
 * Whenever the price of the stock increases from one day to the next (prices[i] < prices[i+1]):
 * Buy on day i and sell on day i+1 to capture the profit (prices[i+1] - prices[i]).
 * Add this profit to the total profit.
 * If the price decreases or remains the same, skip that day.
 * At the end of the loop, return the accumulated profit.
 */

public class BestTimeToBuyStock2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                profit += prices[i+1] - prices[i];
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        // Your code here
    }
}