/*
 * TC = O(N)
 * SC = O(N)
 * 
 * We are trying to find if the previous computed profit is greater or 
 * previous profit with current profit is greater. DP is used
 */
public class BestTimeToBuyAndSellStockII
{
    public static int maxProfit(int[] prices)
    {
        if(prices == null || prices.length == 0) return 0;

        int[] dp = new int[prices.length+1];

        dp[0]=0;

        for(int i =1;i<prices.length;i++)
        {
            dp[i]=Math.max(dp[i-1],dp[i-1]+prices[i]-prices[i-1]);
        }

        return dp[prices.length-1];
    }

    public static void main(String args[])
    {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}