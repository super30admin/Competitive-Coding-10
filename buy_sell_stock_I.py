class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        TC:O(n)
        SC:O(1)
        """
        l=0
        r=1
        n=len(prices)
        maxx=0
        while l<n and r<n:
            if prices[l]<prices[r]:
                maxx=max(maxx, prices[r]-prices[l])
                # l+=1
                r+=1
            else:
                l=r
                r+=1
        return maxx
                
        