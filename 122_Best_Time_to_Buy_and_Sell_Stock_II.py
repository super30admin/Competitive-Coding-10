# Time Complexity : O(n)[n = length of nums list]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Problem Approach - Peak Valley approach
# 1. Iterate over the array and look for peak and valley
# 2. First we look for valley. Increment the i index till we encounter a value which is greater than prev value.
#    Thus, the prev value is the local minimum or the valley
# 3. Next we look for peak. Increment the i index till we encounter a value which is lesser than prev value.
#    Thus, the prev value is the local maximum or the peak
# 4. The (peak - value) value is added to profit. We follow the same process from index next to peak till we hit the end of list.


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:return 0
        i = 0
        j = 0
        n = len(prices)
        res = 0
        while i < n-1 and j < n:
            while i < n-1 and prices[i] > prices[i+1]:
                i+=1
            valley = prices[i]
            j = i+1
            while j < n-1 and prices[j] < prices[j+1]: 
                j+=1
            if j == n:
                 return res
            peak = prices[j]
            i=j+1
            res+= (peak-valley)
        return res
