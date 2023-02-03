// Time Complexity : O(n)
// Space Complexity : O(1) 

public class BestTimeToButSellStockII {
        public int maxProfit(int[] prices) {
            int profit = 0;
            for (int i =1; i < prices.length; i++){
                int temp =  prices[i] - prices[i-1] ;
                if ( temp > 0 ){
                    profit += temp;
                }
            }
            return profit;
        }
    }