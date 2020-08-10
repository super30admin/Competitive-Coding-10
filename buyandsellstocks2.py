# find the point where the cost is miniumum (cost price)
# find another point till the time the cost is increasing. the last element till when the cost is increasing will be the selling price (maximum cost)
# total profit will be sp - cp at different days.
# time complexity - O(n)
# space complexity - O(1)
# did this code run on leetcode? - yes
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ptr1 = 1
        n = len(prices) 
        if n==1: return 0
        
        minval = prices[0] # initialise the minimum value to the cost of share on first day. 
        res = 0
        while ptr1 < n-1:  # traverse till the end of prices array.
            # if some element ahead is less than the minimum value.
            if minval > prices[ptr1]: 
                minval = prices[ptr1]
            elif prices[ptr1] > prices[ptr1+1]: # move the pointer until we reach the point where the cost is maximum. this will be the selling price of share.
                res += (prices[ptr1] - minval)
                minval = prices[ptr1]
                
            ptr1 += 1
        
        # if the value at last position is the last sp.
        if minval < prices[ptr1]:
            res += (prices[ptr1] - minval)
            
        return res
        