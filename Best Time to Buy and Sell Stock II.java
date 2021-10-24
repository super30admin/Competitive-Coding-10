// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// if next element is greater than the current element then buy it (i.e set it as min) and set max = next elemnt 
// get add profit in profit 
// keep doing it for all elements

class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length <= 1)
             return 0;
        int curr = 0;
        int i =0;
        int n = prices.length;
        int min = Integer.MAX_VALUE;
        int profit =0;
        int max =0;
        while(i< n )
        {
            curr = Math.min(min,prices[i]);
        
            if(i < n-1 && curr < prices[i+1])
            {
                min = curr;
                max = prices[i+1];
            }
            if(min != Integer.MAX_VALUE && max > min)
            {
                profit += max-min;
                min =  Integer.MAX_VALUE;
            }
            
            i++;
        }
        
        return profit;
    }
}