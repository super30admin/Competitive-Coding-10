// Time -> O(n)
// Space -> O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int buy = 0;
        int sell = 1;
        int currProfit = 0;
        while(sell < prices.length){
            int nextProf = prices[sell] - prices[buy];
            if(nextProf < currProfit){
                result+= currProfit;
                buy = sell;
                currProfit = 0;
            }
            else{
                currProfit = nextProf;
            }
            sell++;
        }
        if(sell >= prices.length){
            result += prices[prices.length-1] - prices[buy];
        }
        return result;
    }
}
