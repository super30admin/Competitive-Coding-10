class Solution {
    public int maxProfit(int[] prices) {
        // 7 1 5 3 6 4 , i ->l = 6-4<  3 
        //7, 1
        //buy 7 or buy 1? 
        // is 1 smaller?
        // yes? compare with 5, 5 > 1 = profit.
        // 7 -> 0
        // 1 -> 20 
        // 6 -> 20
        
        //min price
        //max profit 
        
        //two pointer : 1 and 2 item
        // 7 , 1 = -6
        // 1, 5 =4 
        
        //two pointer: 3,6 
        
        if(prices == null || prices.length == 0) return 0;
        
        int profit = 0;
        int buyIndex = 0;
        
        for(int i = 0; i < prices.length-1; i++){
            if(prices[i] < prices[i+1]){
                buyIndex = i;
                profit += prices[i+1]-prices[i];
            }
        }
        
        return profit;
    }
}