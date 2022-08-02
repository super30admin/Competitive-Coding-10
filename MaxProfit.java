//Time Complexity=O(n)
//Space Complexity=O(1)
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        for(int i=0;i<n-1;i++){
            if(prices[i]<prices[i+1]){
                profit+=prices[i+1]-prices[i];
            }
        }

        return profit;
    }
}
