// Time Complexity : The time complexity is O(n) where n is the length of the array
// Space Complexity : The space complexity is O(n) where n is the length of the array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0){
            return 0;
        }
        int output=0;
        int peak = prices[0];
        int valley = prices[0];

        int i = 0;

        while(i < prices.length-1){

            // find the valley
            while(i < prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            valley = prices[i];

            //find the peak
            while(i < prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            peak = prices[i];
            output += peak-valley;
        }

        return output;

    }
}