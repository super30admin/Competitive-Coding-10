class Solution {
    int max = 0;
    public int maxProfit(int[] prices) {
        for(int i=1;i<prices.length;i++){
            int diff = prices[i]-prices[i-1] > 0 ? prices[i]-prices[i-1] : 0;
            max = max + diff;
        }
        return max;
    }
}

//Time coomplexity : O(N)
//Space complexity :O(1)
