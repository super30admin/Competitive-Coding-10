/*
Time: O(N) size of given array
Space: O(1) no extra space is used here 
*/
class Solution {
    public int maxProfit(int[] prices) {
        //Base case
        if(prices==null || prices.length==0){
            return 0;
        }
        
        //Logic:
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            // System.out.println("Starting from idx: "+ i + " prices[i]: "+ prices[i]);
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                //This value is high, move to next idx
                i++;
            valley = prices[i];
            // System.out.print("Valley: "+ valley);
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            // System.out.println(" Peak: "+ peak);
            maxprofit += peak - valley;
            // System.out.println("maxprofit: "+ maxprofit);
        }
        return maxprofit;
        
    }
}
