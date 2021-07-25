package CompetitiveCoding10;

/*S30 FAANG Problem #132 {Easy} - https://www.youtube.com/watch?v=DtWlvtGmDXQ&list=PLWtKyKogBpBDSDsgA3mcSlstDoKPNGSx0&index=14
    You are given a price array where each element is representing the price of the stock on that day. 
    you need to come up with an algorithm so as to make the maximum profit.
    you can complete as many transactions as you like i.e. you can buy and sell one share of the stock many times. 
    but make sure that you dont get yourself engaged in multiple transactions at the same time i.e. you cannot sell the stock before you buy again 

    Example 1:
    Input: [7,1,5,3,6,4]
    Output: 7

    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
                 Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.

    Example 2:
    Input: [1,2,3,4,5]
    Output: 4

    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.

                 Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are

 engaging multiple transactions at the same time. You must sell before buying again.
 
Source Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
-------------------------------------------------------------------------------------------------------
Time complexity : o(N) 
space complexity: o(1)
Did this code run successfully in leetcode : yes
problems faces : no
Approach :  */
    

public class BuyAndSellStock {
    
    public static void main(String[] args)
    {
        int[] a = {7,6,4,3,9,1,8};
        System.out.println(maxProfit(a));
    }
    
    public static int maxProfit(int[] stockprices)
    {
        int maxProfit =0;
        int leastPrice = Integer.MAX_VALUE;
        int buyPrice = 0;
        int sellPrice = 0;
        
        for(int i=0;i<stockprices.length;i++)
        {
            if(stockprices[i] < leastPrice)
            {
                leastPrice = stockprices[i];
                buyPrice = leastPrice;
                
                
            }
            else if(maxProfit < stockprices[i] - leastPrice)
            {
                maxProfit = stockprices[i] - leastPrice;
                System.out.println("buyPrice"+leastPrice);
                sellPrice = stockprices[i];
                System.out.println("sellPrice"+sellPrice);
                
            }
        }
        
        return maxProfit;
    }

}
