// TC: O(n) all the numbers in the array is visited
// SC: O(1) no extra space is used

// Runs successfully on Leetcode
// Following is the greedy algorithm, adjacent stocks are checked for profit
public class BestTimeToBuySellStocks2 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 })); // 7
        System.out.println(maxProfit(new int[] { 1, 2, 3, 4, 5 })); // 4
        System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 })); // 0
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        int profit = 0;
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                profit += prices[i] - prices[i - 1];
        }
        return profit;
    }
}