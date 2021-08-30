//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        if(prices == null || prices.length == 0){
            return 0;
        }
        int i=0;
        while(i<prices.length-1){
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            int low = prices[i];

            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            int high = prices[i];
            profit = high-low+profit;
        }
        return profit;
    }
}