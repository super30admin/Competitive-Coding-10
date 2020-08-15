//Time Complexity:  O(n), n is total no of stocks
//Space Complexity: O(1)

<-----Buy and Sell 2---->
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices == null || prices.length == 0){
            return profit;
        }
        for(int i = 0; i <prices.length-1; i++){
            if(prices[i + 1] > prices[i]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }
}



<-----Buy and Sell 1---->

class Solution {
	public int maxProfit(int[] prices){
		int max=0;
		int min = Integer.MAX_VALUE;
		for(int i =0; i<prices.length; i++){
			if(prices[i] < min){
				min = prices[i]
			} else{
				max = Math.max(max,prices[i] - min);
			}	
		}
		return max;
	}
}