#Problem1: https://leetcode.com/problems/peeking-iterator/description/
# Time Complexity: O(n),We loop through the prices list once, comparing each day to the previous day, so the work grows linearly with the number of days

# Space Complexity: O(1),We only use a single variable to store profit, no extra data structures like memo tables or arrays are used
# Approach:
# Since we can buy and sell unlimited times with no cost, we do not need to track actual buy and sell days
# Instead we walk through the prices day by day and any time todays price is higher than yesterdays, we treat that rise as its own small profit and add it to our total
# Any day where the price drops or stays the same, we simply skip it since there is nothing to gain

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0  # this will store our running total profit, starts at 0 since we have not looked at any days yet

        for i in range(1,len(prices)):  # start from index 1 since we always compare todays price to the previous day, day 0 has no previous day
            if prices[i]>prices[i-1]:  # check if todays price is higher than yesterdays price, meaning there was a profitable rise
                profit += prices[i]-prices[i-1]  # add that days gain to our running profit total, this is the greedy move, grab the gain right away
        return profit  # after checking every consecutive pair of days, return the total profit we collected