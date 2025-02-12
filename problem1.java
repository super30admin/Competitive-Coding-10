public class problem1 {

    // Time Complexity: O(n)
    //Space Complexity: O(1)

    public int maxProfit(int[] prices) {
        int profit=0;
        int min= Integer.MAX_VALUE;
        for(int i=1;i<prices.length;i++)
        {
            min = Math.min(min,prices[i]);
            profit= Math.max(profit,prices[i]-min);
        }
        return profit;
    }

}
