// Time Complexity: O(n)
// Space Complexity: O(1)
// Idea here is to keep checking if current value is greater than previous value
// that means we can sell stocks purchased on prev value.
// on iterating to next if previous is lesser than current, that mean we bought on prev price again
// and sold at higher price, added to maxProfit.
// if current price is greater than previous means we did not buy stocks on previous day at all
class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2) return 0;
        int maxProfit = 0;
        for(int i = 1; i<prices.length; i++) {
            if(prices[i]>prices[i-1]){
                maxProfit+=prices[i]-prices[i-1];
            }
        }
        return maxProfit;
    }
}