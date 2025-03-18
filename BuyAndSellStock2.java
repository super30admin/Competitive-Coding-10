class Solution {
    public int maxProfit(int[] prices) {
        //Time Complexity:O(n)
        //Space Complexity:O(1)
       int prev = prices[0];
       int total = 0;
        for (int i =1; i< prices.length;i++) {
            if ( prices[i] >prev) 
                total += prices [i] - prev;
                    prev = prices[i];
        }
        return total;
    }
}
