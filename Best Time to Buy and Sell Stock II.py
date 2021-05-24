class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        # Greedily calculate the diff when price is increasing and add it to the profit.
        for i in range(len(prices)-1):
            diff = prices[i+1] - prices[i]
            if diff > 0:
                profit += diff
        return profit

### Complexity Analysis
# Time Complexity: O(N) --> One Pass
# Space Complexity: O(1) --> No extra space used