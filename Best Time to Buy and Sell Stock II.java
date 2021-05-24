//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Your code here along with comments explaining your approach
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length==0){
            return 0;
        }
        int maxProfit = 0,min=prices[0],max=prices[0],i=0;
        while(i<prices.length-1){
           //find the min value
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            min = prices[i];
            //fimd the max
            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            max = prices[i];
            maxProfit += max-min;
        }
        return maxProfit;
    }
}