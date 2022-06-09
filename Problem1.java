public class Problem1 {
    // TC : O(n)
    // SC : O(n)
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int total = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                total += prices[i] - prices[i - 1];
            }
        }
        return total;
    }
}
