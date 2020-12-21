# time complexity  O(n)
# space complexity  O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if prices==[] or len(prices)==0: return
        profit=0
        for i in range(1,len(prices)):
            if prices[i-1]<prices[i]:
                profit = profit+ prices[i]-prices[i-1];
       
        return profit
    