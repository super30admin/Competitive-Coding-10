
// Time - O(N)
// Space - O(1)



class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0) return 0;

        int result = 0;

        int n = prices.length - 1;

        for(int i = 0; i < n; i++) {

            if(prices[i+1] > prices[i]) {

                result += prices[i+1] - prices[i];

            }

        }

        return result;

    }
}