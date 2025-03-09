//TC: O(n)
//SC: O(1)
//approach: iterating over array, buy if next day price is more, sell if bought any and next day price is less

public class BestTimeToBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = -1;
        for(int i=0; i<prices.length-1;i++){
            if(buyPrice==-1 && prices[i+1] > prices[i]){
                buyPrice = prices[i];
            }else if(buyPrice != -1 && prices[i]>prices[i+1] && prices[i]>=buyPrice){
                profit+= prices[i]-buyPrice;
                buyPrice=-1;
            }
        }

        if(buyPrice!=-1){
            profit+= prices[prices.length-1]-buyPrice;
        }
        return profit;
    }
}
