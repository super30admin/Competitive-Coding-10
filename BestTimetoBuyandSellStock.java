// Time Complexity : O(N) where N is the length of the input array, as we need to iterate through the array once to calculate the total profit.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// The idea is to iterate through the array of stock prices and calculate the profit for each pair of consecutive days. If the price on the next day is higher than the price on the current day, we can make a profit by buying on the current day and selling on the next day. We add this profit to our total profit. By doing this for all pairs of consecutive days, we can calculate the maximum profit that can be achieved by making multiple transactions (buying and selling multiple times).
//  The time complexity of this approach is O(N) where N is the length of the input array, and the space complexity is O(1) since we are using only a constant amount of extra space to store the total profit. 
// The maxProfit method takes an array of stock prices as input and returns the maximum profit that can be achieved by making multiple transactions.
//  We initialize a variable totalProfit to 0, and then iterate through the array of prices. For each pair of consecutive days, we check if the price on the next day is higher than the price on the current day. If it is, we calculate the profit by subtracting the current day's price from the next day's price and add it to totalProfit. Finally, we return totalProfit as the result. 
class Solution {

    public int maxProfit(int[] prices) {

        int totalProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[i] < prices[i + 1]) {
                totalProfit += prices[i + 1] - prices[i];
            }
        }

        return totalProfit;
    }
}