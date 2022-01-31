
class BuySellStock2 {
    public int maxProfit(int[] prices) {
        /*
        TC: O(n)
        SC: O(1)
        */
        int maxCost=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                maxCost+=prices[i+1]-prices[i];
            }
        }
        return maxCost;
    }
}