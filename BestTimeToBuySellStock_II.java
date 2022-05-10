
//Time Complexity : O(n)
//Space Complexity : O(1)
public class BestTimeToBuySellStock_II {	
	public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1; i< prices.length; i++){
            if(prices[i] > prices[i-1])
                profit += prices[i]- prices[i-1];
        }
        return profit;
    }
	
	// Driver code to test above
	public static void main (String[] args) {	
		BestTimeToBuySellStock_II ob  = new BestTimeToBuySellStock_II();		
		int[] prices = {7,1,5,3,6,4};
		System.out.println("Max profit after buying and selling stocks: "+ob.maxProfit(prices));
	}
}
