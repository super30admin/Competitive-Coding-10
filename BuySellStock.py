#Time complexity: O(n)
#Space complexity: O(1)

class Solution:
    def maxProfit(self, arr):
        minB = arr[0]
        if len(arr) == 1:
            return 0
        profit = 0 if arr[1] < minB else arr[1]-minB
        for i in range(1, len(arr)):
            curr = arr[i]
            if curr < minB:
                minB = curr
            else:
                profit = max(profit, curr-minB)
        return profit
