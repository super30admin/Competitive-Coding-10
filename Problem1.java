/*
Best Time to Buy and Sell Stock II
approach: we can see that diff btwn 2 elements gives the decision to buy and sell or not
time: O(n)
space: O(1)
 */
public class Problem1 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, currProfit = 0;
        int prev = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++) {
            if(prices[i]>prev) {
                currProfit += prices[i]-prev;
            }
            prev = prices[i];
        }
        return currProfit;
    }
}
