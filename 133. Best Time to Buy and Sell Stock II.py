class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minprice = float("inf")
        maxprofit = 0

        for price in prices:
            # we compare if the price on the current day is greater than the previous day
            # If yes we take difference of both the prices as profit and add it total Profit
            if price > minprice:
                maxprofit = maxprofit + price - minprice
                # update the minimum price to current day price as we can have at most one stock at a time,
                # That means we sold previous stock
                minprice = price
            else:
                # if price is less we update the current day price as minimum
                minprice = price
        return maxprofit


# Time Complexity: O(n)
# Space Complexity:(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
