#Time Complexity :o(n) 
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if(len(prices)==0 or prices==None):
            return 0
        
        base=prices[0]
        peak=prices[0]
        profit=0
        i=0
        n=len(prices)
        while(i<n-1):
            #get the base number
            while(i<n-1 and prices[i]>=prices[i+1]):
                i+=1
            base=prices[i]
            #get the peak value
            while(i<n-1 and prices[i]<=prices[i+1]):
                i+=1
            peak=prices[i]
            
            profit+=peak-base
            
        return profit