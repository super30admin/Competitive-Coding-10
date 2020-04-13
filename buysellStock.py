'''
Time Complexity: O(n)
Space Complexity:O(1)
Did this code successfully run on Leetcode : Yes
Explanation:   In this solution if the stock had increased before and now decreased, that means there was a
peak and now there is a valley so capture that diff as profit and keep adding all of them to get the answer
'''

def maxProfit(self, prices: List[int]) -> int:
    # In this solution if the stock had increased before and now decreased, that means there was a
    # peak and now there is a valley so capture that diff as profit and keep adding all of them to
    # get the answer
    if len(prices) < 2:
        return 0

    maxProfit = 0

    for i in range(1, len(prices)):
        if prices[i] > prices[i - 1]:
            maxProfit += prices[i] - prices[i - 1]

    return maxProfit