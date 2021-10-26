# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach



class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minn=prices[0]
        profit=0
        for i in range(len(prices)):
            minn=min(minn,prices[i])
            profit=max(prices[i]-minn,profit)
        return profit