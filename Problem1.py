#Time Complexity :O(n)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProf=0
        for i in range(1,len(prices)):
            if prices[i]>prices[i-1]:
                maxProf+=prices[i]-prices[i-1]
        return maxProf
        