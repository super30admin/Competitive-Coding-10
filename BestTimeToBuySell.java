class Solution {
    //Maximum profit is attained by adding profits - large / small
    //Time Complexity: O(n)
    //Space Complexity: O(1)
    public int maxProfit(int[] prices) {
    
    
        int min = prices[0];
        int profit = 0;
     for(int i=1;i<prices.length;i++)
     {
         if(prices[i]<prices[i-1])
         {
              profit += prices[i-1]-min;
              min = prices[i];
         }
         else if(i==prices.length-1)
         {
             profit += prices[i]-min; 
         }
     }
        
    return profit;
    }
}