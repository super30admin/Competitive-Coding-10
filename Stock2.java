// TC: O(n) where n is the length of the array.
// SC: O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Stock2{
    public int maxProfit(int[] prices) {
        if(prices.length == 0 || prices == null) return 0;
        int min, max, i = 0;
        int profit = 0;
        while(i <= prices.length - 2) {
            while(i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            min = prices[i];
            while(i <= prices.length - 2 && prices[i] <= prices[i + 1]) {
                i++;
            }
            max = prices[i];
            profit = profit + max - min;
        }
        return profit;
    }
}