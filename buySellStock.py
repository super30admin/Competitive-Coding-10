'''
time complexity: O(n)
space complexity: O(1)
'''
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        #[1,2,3,4,5]
        i = 1
        sums=0
        buy=0
        flag = True
        #[1,2,3,4,5]
        #buy [1]
        while(i<len(prices)):
            #[1,2,3,4,5]
            #      
            if(prices[i]>prices[i-1]):
                sums+=(prices[i]-prices[i-1])
            i+=1
        return sums