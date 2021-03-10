class Solution:
    
    # O(N ^ 2) Time and O(1) space
    def maxProfit(self, prices: List[int]) -> int:

        if not prices or len(prices) == 0:
            return 0

        max_profit = 0

        for i in range(len(prices)):
            for j in range(i+1, len(prices)):
                profit = prices[j] - prices[i]
                max_profit = max(max_profit, profit)

        return max_profit


    
    # Time - O(N), Space - O(1)
    def maxProfit(self, prices: List[int]) -> int:

        if not prices or len(prices) == 0:
            return 0

        max_profit = 0
        min_price_to_buy = prices[0]

        for i in range(1, len(prices)):

            if prices[i] < min_price_to_buy:
                min_price_to_buy = prices[i]

            elif prices[i] - min_price_to_buy > max_profit:
                max_profit = prices[i] - min_price_to_buy


        return max_profit