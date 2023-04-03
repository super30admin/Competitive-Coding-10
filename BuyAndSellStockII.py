"""
Rasika Sasturkar
Time Complexity: O(n), where n is total no. of prices
Space Complexity: O(1)
"""


def maxProfit(prices) -> int:
    # null case
    if prices is None:
        return 0

    n = len(prices)
    max_profit = 0

    for i in range(n - 1):
        # valley condition
        if prices[i] > prices[i + 1]:
            continue
        profit = prices[i + 1] - prices[i]
        max_profit += profit

    return max_profit


def main():
    """
    Main function - examples from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    print(maxProfit(prices=[7, 1, 5, 3, 6, 4]))  # returns 7
    print(maxProfit(prices=[1, 2, 3, 4, 5]))  # returns 4
    print(maxProfit(prices=[7, 6, 4, 3, 1]))  # returns 0


if __name__ == "__main__":
    main()
