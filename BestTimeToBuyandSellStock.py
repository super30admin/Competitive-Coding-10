"""
    // Time Complexity :O(n)
    // Space Complexity :O(1)
    // Did this code successfully run on Leetcode : YES
    // Any problem you faced while coding this : NA

    //Explanation:
    Compare the subsequent days and check if prices[i] < prices[i+1]
    calculate profit and add it to the result
"""
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # edge
        if len(prices) < 2  : return 0

        result = 0
        # logic
        for i in range(len(prices)):
            if i != len(prices) - 1  and prices[i] < prices[i+1]:
                result += prices[i+1] - prices[i]
        return result
