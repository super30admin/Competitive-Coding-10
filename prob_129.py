# leetcode 122:

# leetcode 122:
# algo Find valley and next peak find profit and keep finding valleys and peaks this way and calculate profits
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) == 0:
            return 0
        # variables
        i = 0
        valley = prices[0]
        peak = prices[0]
        max_profit = 0
        while i < len(prices) - 1:  # last element will be taken care of in th while loop itself
            while i < len(prices) - 1 and prices[i] >= prices[i + 1]:  # case when we find a valley at i+1
                i += 1
            valley = prices[i]  # i+1 in the while loop is i here
            while i < len(prices) - 1 and prices[i] < prices[i + 1]:  # case when we find a peak at i+1
                i += 1
            peak = prices[i]
            max_profit += peak - valley  # this case peak and valley at the end become equal and this leads to adding zero
        return max_profit


# algo : 2 pointer approach, low and high gave tem in an tuple
# for every tock we find a point till we find value greater than the bought value and if the value is found then calculate profit, find till we get highest profit , in case we encounter a value lower than bought value after g=making some profit, then put that as profit earned  and move on to buying next stock
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        prof_final = 0
        # edge case
        if not (prices) or len(prices) <= 1:
            return prof_final
        # 2 pointers
        low_high = (-1, -1)
        # profit calacualtor
        prof = 0
        for i in range(1, len(prices), 1):
            if prices[i] - prices[i - 1] >= 0:
                if prof == 0:  # case when profit is not made with thsis tock yet
                    low_high = (i - 1, i)
                    prof = prices[i] - prices[i - 1]
                else:  # case when profit is already made with this stock
                    low_high = (low_high[0], i)
                    prof = prices[i] - prices[low_high[0]]
            else:  # casea new stock is to be bought
                low_high = (i, -1)  # intitiate low pointer
                prof_final += prof  # ass previous calculated profit to final profit
                prof = 0  # start with finding new profit on selling this stock
        # final profit
        prof_final += prof
        return prof_final


#best sol : here the peak and valleys will be found by dorectly summing up the positive differences between adjacent stocks

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        sum_sum = 0
        if not (prices) or len(prices) <= 1:
            return sum_sum
        for i in range(1, len(prices), 1):
            # print(i)
            if prices[i] - prices[i - 1] > 0:
                sum_sum += prices[i] - prices[i - 1]
                # i += 1
        return sum_sum
