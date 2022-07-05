// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0){
            return 0;
        }
        int result = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                int currSum = prices[i]-prices[i-1];
                result += currSum;
            }
        }
        return result;
    }
}
