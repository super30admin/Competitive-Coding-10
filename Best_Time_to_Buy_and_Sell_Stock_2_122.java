//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : None

package com.s30.satish;

class Best_Time_to_Buy_and_Sell_Stock_2_122 {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for(int i = 0; i < prices.length - 1; i++)
        {
            if(prices[i] < prices[i+1])
              sum += prices[i+1] - prices[i] ; 
        }
        return sum;
    }
    public static void main(String[] args)
    {
    	int[] arr = {73,74,75,71,69,72,76,73};
    	Best_Time_to_Buy_and_Sell_Stock_2_122 profit = new Best_Time_to_Buy_and_Sell_Stock_2_122();
    	System.out.println(profit.maxProfit(arr));
    }
}
