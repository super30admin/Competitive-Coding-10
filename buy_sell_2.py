"""
# Time complexity - O(n) 
# Space Complexity: O(n)
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None
Approach : Traverse the list when there is a valley(low value) buy and when there is a peak(high value) sell.
"""

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        n = len(prices)
        max_pro = 0
        
        for i in range(1,n):
            max_pro += max(prices[i]-prices[i-1],0)
            
        return max_pro
        
