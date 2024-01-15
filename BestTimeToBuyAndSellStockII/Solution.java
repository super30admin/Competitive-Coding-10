// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * One pass Solution
 */
class Solution {
    public int maxProfit(int[] prices) {

        int result = 0;
        for(int i=1; i<prices.length; i++)
            if(prices[i-1] < prices[i])
                result += prices[i] - prices[i-1];

        return result;
    }
}

/**
 * Peak valley approach (This is also one pass only)
 */
// Time Complexity : O(n)
// Space Complexity : O(1)
class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int result = 0;
        int i=0;
        int min = 0, max = 0;
        while(i < n-1) {
            while(i < n-1 && prices[i] >= prices[i+1]) i++;
            min = prices[i];
            while(i < n-1 && prices[i] <= prices[i+1]) i++;
            max = prices[i];
            result += max - min;
        }

        return result;
    }
}