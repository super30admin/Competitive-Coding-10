class Solution {
    public int maxProfit(int[] prices) {
        int minL = prices[0];
        int maxL = prices[0];
        int profit = 0;

        for(int i =1; i<prices.length; i++){
            if(prices[i] < prices[i-1]){
                profit += maxL - minL;
                minL = maxL = prices[i];
            }else if(prices[i] > prices[i-1])
                maxL = prices[i];
        }
     if(maxL != minL) profit += maxL - minL;
     return profit;
    }
}