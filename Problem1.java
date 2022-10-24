//Time complexity : O(N)
//Space complexity : O(1)

public class Problem1 {
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int profit = 0;
        int buy = prices[0];
        int sell = prices[0];

        for(int i =1; i<n; i++){

            while(i<n && (prices[i] <=prices[i-1] ) ){

                i++;

            }
            buy = prices[i-1];

            while(i<n && (prices[i] >= prices[i-1]) ){
                i++;
            }
            sell = prices[i-1];

            profit +=(sell-buy);


        }
        return profit;

    }
}
