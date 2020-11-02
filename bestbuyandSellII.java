// TC: O(n)
public class bestbuyandSellII {

	public int bestbuySell(int[] prices) {
		
		int maxprofit = 0, profit = 0;
		// initiliaze the maxprofit and temp profit that we need calculate every time we find a new max profit
		for(int i=0;i<prices.length-1;i++) {
			
			// check if the prices[i+1 is greater than prices[i so that we can sell the stock and calculate our profit;
			// keep on adding our profit since we find the total stock sold
 			if( prices[i] < prices[i+1]) {
				profit += prices[i+1] - prices[i];
			}
			// to find the maxprofit, keep comparing the temporary profit with maxprofit, if the current profit is greater than
 			// current profit, we need to update our current maxprofit
			if(maxprofit < profit)
				maxprofit = profit;
		}
		//return our final maxprofit
		return maxprofit;
	}
	
	
}
