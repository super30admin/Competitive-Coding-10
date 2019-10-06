# Time Complexity : O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        minprice = float("inf")
        maxprofit = 0

        for price in prices:
            if price < minprice:
                minprice = price
            if price - minprice > maxprofit:
                maxprofit = price - minprice
        return maxprofit