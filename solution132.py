#Time Complexity:O(n)
#Space Complexity:O(1)
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices)==0 or len(prices)==1:
            return 0
        result=0                                        #variable o hold maximum profit
        curr=prices[0]                                  
        i=1
        while(i<len(prices)-1):                         #parse through the prices array
            if prices[i]<=curr:                         #if a given element is smaller than the current shift current
                curr=prices[i]
            else:                                       #else if the next element is smaller find the difference and add to result.
                if prices[i+1]<prices[i]:
                    result+=prices[i]-curr
                    curr=prices[i]
            i+=1
        result=max([result,result+prices[i]-curr])      #find the max profit with last element
        return result                                   #return result.