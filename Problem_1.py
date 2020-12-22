"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
The maximum a person can earn is the difference between 2 continous values if it is positive. So, we
iterate through the array, if we find a bigger value, we subtract the preceeding smaller value from it and add
it to the total.
"""


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        summ = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i-1]:
                summ += prices[i]-prices[i-1]
        return summ
