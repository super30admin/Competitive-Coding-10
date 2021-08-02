class Solution:
    
    def maxProfit(self, prices: List[int]) -> int:
        """using peak and valley approach
        Time complexity-O(n)
        Space complexity-O(1)"""
        peak=prices[0]
        valley=prices[0]
        i=0
        maxprofit=0
        while i<len(prices)-1:
            while i<len(prices)-1 and prices[i]>=prices[i+1]:
                i+=1
            valley=prices[i]
            while i<len(prices)-1 and prices[i]<=prices[i+1]:
                i+=1
            peak=prices[i]
            maxprofit+=peak-valley
        return maxprofit
            
                
            
            
        """Bruteforce approach--using recursion
        Time complexity-O(n^n)"""
#         return self.helper(prices, 0)
        
#     def helper(self, prices, index):
#         maxi=0
#         if index>=len(prices):
#             return 0
#         for start in range(index, len(prices)):
#             maxprofit=0
#             for i in range(start+1, len(prices)):
#                 profit=self.helper(prices, i+1)+prices[i]-prices[start]
#                 maxprofit=max(profit, maxprofit)            
#             maxi=max(maxprofit, maxi)
#         return maxi
                
                    
                
