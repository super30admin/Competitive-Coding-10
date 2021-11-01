package CompetitiveCoding10;

//time complexity: O(N)
//space complexity : O(1)
public class BuyAndSellStocks2 {
    public int maxProfit(int[] prices) {
        int total = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                total += prices[i] - prices[i-1];
            }
        }
        return total;
    }
}
