//Time Complexity:  O(n), n is total no of stocks
//Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        if(prices==null || prices.length==0){
            return profit;
        }
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy){
                profit+=(prices[i]-buy);
            }
            buy= prices[i];           
        }
        return profit;
    }
} 