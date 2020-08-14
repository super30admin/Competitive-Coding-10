# Best time to buy and sell stock 1
# Time Complexity: O(n), where n is the length of the input array.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def maxProfit(self, prices):
        if not prices:
            return 0

        retVal = 0
        gMin = float('inf')
        # For all elements compute the global minimum
        # and the profit that can be earned
        for i in range(len(prices)):
            if prices[i] < gMin:
                gMin = prices[i]
            elif prices[i] - gMin > retVal:
                retVal = prices[i] - gMin

        return retVal

#------------------------------------------------------------x---------------------------------------------------------#

# Best time to buy and sell stock 2
# Time Complexity: O(n), where n is the length of the input array.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution(object):
    def maxProfit(self, prices):
        if not prices:
            return 0

        retVal = 0
        # Calculate profit for all instances where applicable
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                retVal += prices[i] - prices[i - 1]

        return retVal
