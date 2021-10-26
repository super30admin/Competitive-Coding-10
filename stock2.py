# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach

class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        peak=prices[0]
        valley=prices[0]
        maxx=0
        i=0
        while(i<len(prices)-1):
            while(i<len(prices)-1 and prices[i]>=prices[i+1]):
                i+=1
            valley=prices[i]
            while(i<len(prices)-1 and prices[i]<=prices[i+1]):
                i+=1
            peak=prices[i]
           
            maxx=maxx+peak-valley
        return maxx
                
                
                
            