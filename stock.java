// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : figuring out the graph part and drawing peek and valley
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length==1) return 0;
        int out = 0;
        int i =0;
        while(i<prices.length)
        {
            while(i<prices.length-1 && prices[i]>=prices[i+1]) i++;
            int valley = prices[i];
            while(i<prices.length-1 && prices[i]<=prices[i+1]) i++;
            int peak = prices[i];
            out+=peak-valley;
            i++;
            
        }
        return out;
    }
}