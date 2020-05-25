// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n<2)return 0;
        int maxProfit=0;
        int minStock = prices[0];
        for(int price:prices){
            maxProfit = Math.max(maxProfit,price - minStock);
            minStock = Math.min(minStock, price);
        }
        return maxProfit;
    }
}