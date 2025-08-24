def maxProfit(prices) -> int:
    '''
    122. Best Time to Buy and Sell Stock II
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

    You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

    On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

    Find and return the maximum profit you can achieve.

    Example 1:
    Input: prices = [7,1,5,3,6,4]
    Output: 7
    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    Total profit is 4 + 3 = 7.

    Example 2:
    Input: prices = [1,2,3,4,5]
    Output: 4
    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
    Total profit is 4.

    Example 3:
    Input: prices = [7,6,4,3,1]
    Output: 0
    Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.

    Solution:
    1. Recrusion (Brute Force)
    On any day, we have three choices
    if not already bought stock -> buy stock or sell stock or do nothing
    If already bought stock -> sell stock or do nothing
    If already sold stock -> buy stock or do nothing

    Time: O(3^N), Space: O(N) (recursive stack)

    2. Greedy
    We can time the market if we buy on every local minima and sell on every local maxima. Timing the market leads to max profit. Thus, the most optimal path in the recursion (brute force) solution is also the greedy path solution (timing the market).

    Time: O(N), Space: O(1)
    '''

    N = len(prices)
    if N <= 1:
        return 0
    sum = 0
    for i in range(1, N): # O(N)
        delta = prices[i] - prices[i-1]
        if delta > 0: # profit trade
            sum += delta
    return sum # max profit

def run_maxProfit():
    tests = [([7,1,5,3,6,4], 7), ( [1,2,3,4,5], 4), ([7,6,4,3,1], 0)]
    for test in tests:
        prices, ans = test[0], test[1]
        profit = maxProfit(prices)
        print(f"\nprices = {prices}")
        success = (ans==profit)
        print(f"Pass: {success}")
        if not success:
            print("Failed")
            return

run_maxProfit()
