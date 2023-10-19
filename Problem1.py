#Time complexity is O(n)
#Space complexity is O(1)
#No issues faced while coding
#Code ran successfully on leetcode
class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        #base condition
        if(len(prices)==0):
            return 0
        #Initializing all the required variables
        n=len(prices)
        i=0
        peeks=prices[0]
        valley=prices[0]
        maxprofit=0
        #Iterating through the array
        while(i<len(prices)-1):
            #We will be moving left until we find a valley
            while(i<n-1 and prices[i]>=prices[i+1]):
                i+=1
            valley=prices[i]
            #We will be moving left until we find a peek
            while(i<n-1 and prices[i]<=prices[i+1]):
                i+=1
            peek=prices[i]
            #Profit is the difference between peek and valley
            maxprofit+=peek-valley
        #Fianlly we will be returning the maxprofit
        return maxprofit