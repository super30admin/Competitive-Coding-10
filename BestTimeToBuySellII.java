

// Time Complexity : O(N) for Both Approaches
// Space Complexity : O(1) for Both Approach
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

/**
 *  Approach 1
 *  This approach is based on finding the peak and valley in number.
 *  Plotting numbers on graph will give use clear picture.
 *  we need to consider every peak immediately following a valley to maximize the profit
 * 
 *   Total Profit = Sum of All Heights of Peak  - Sum of All Heights of Valley
 */

 /**
  * Approach 2
    The solution is much simpler than Approach 1 .In this apporach, 
    we can directly keep on adding the difference between the consecutive numbers of the array if the second number is larger than the first one, 
     and at the total sum we obtain will be the maximum profit
  */

public class BestTimeToBuySellII{

    public int maxProfit1(int[] prices) {
        if(prices.length == 0)
            return 0;
            int maxprofit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1])
                    maxprofit += prices[i] - prices[i - 1];
            }
            return maxprofit;
    }

    public int maxProfit2(int[] prices) {
        if(prices.length == 0)
            return 0;
      	int peak = prices[0];
		int valley = prices[0];
		int max = 0;

		int size = prices.length - 1;
		for (int i = 0; i < size;) {
			while (i < size && prices[i] >= prices[i + 1]) {
				i++;
			}
			valley = prices[i];

			while (i < size && prices[i] <= prices[i + 1]) {
				i++;
			}
			peak = prices[i];

			max += peak - valley;
		}  
        return max;
    }

    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};

        System.out.println(new BestTimeToBuySellII().maxProfit1(prices));
        
        System.out.println(new BestTimeToBuySellII().maxProfit2(prices));
    }
}