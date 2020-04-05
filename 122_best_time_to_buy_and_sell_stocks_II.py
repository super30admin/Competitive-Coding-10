from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
            Time Complexity - O(n)
            Space Complexity - O(1)
        """
        if len(prices) < 2:
            return 0

        profit = 0
        buy_ptr, sell_ptr = 0, 1

        while sell_ptr < len(prices):
            if prices[sell_ptr] > prices[buy_ptr]:
                profit += prices[sell_ptr] - prices[buy_ptr]
            buy_ptr += 1
            sell_ptr += 1
        return profit

    def maxProfit(self, prices: List[int]) -> int:
        """
            Time Complexity - O(n)
            Space Complexity - O(1)
        """
        i = profit = 0
        N = len(prices) - 1
        while i < N:
            # finding the last continuous day that the price is smallest
            while i < N and prices[i + 1] < prices[i]:
                i += 1
            buy = prices[i]

            # finding the last continuous day that the price is biggest
            while i < N and prices[i + 1] > prices[i]:
                i += 1
            sell = prices[i]

            profit += sell - buy
        return profit


if __name__ == '__main__':
    print(Solution().maxProfit([7, 1, 5, 3, 6, 4]))
    print(Solution().maxProfit([1, 2, 3, 4, 5]))
    print(Solution().maxProfit([7, 6, 4, 3, 1]))
