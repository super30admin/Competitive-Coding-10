// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public int maxProfit(int[] prices) {

                int n = prices.length;
                if(n<=1) return 0;
                int totalProfit = 0;

                for(int i =1;i<n;i++) {

                    int profit = prices[i]-prices[i-1];
                    totalProfit += profit<0?0:profit;

                }

                return totalProfit;
    }

}
