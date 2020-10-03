//Best Time to Buy and Sell Stock I
/***********************Brute Force*******************/
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Best_Time_to_Buy_and_Sell_Stock_BF {
	public int maxProfit(int[] prices) {
		int max = 0;
		for(int i=0; i< prices.length; i++){
			for(int j=i+1; j<prices.length; j++){
				int profit = prices[j] - prices[i];
				if(profit > max)
					max = profit;
			}
		}
		return max;
	}
}

/*************************One Pass, DP Kadens Algorithm*********************/
//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            min = Math.min(prices[i], min);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}

//Best Time to Buy and Sell Stock II

//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Best_Time_to_Buy_and_Sell_StockII {
    public int maxProfit(int[] prices) {
        int difference = 0;
        for(int i=1; i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                difference += prices[i] - prices[i-1];
            }
        }
        return difference;
    }
}