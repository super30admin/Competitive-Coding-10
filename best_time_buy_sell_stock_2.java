// Time Complexity : O(n)
// Space Complexity :O(1)
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0 || prices==null) return 0;
        int min=prices[0];
        int n=prices.length;
        int max=prices[0];
        int i=0;
        int res=0;
        
        while(i<n-1){
            while(i<n-1 && prices[i]>=prices[i+1]) i++;
            min=prices[i];
            while(i<n-1 && prices[i]<=prices[i+1]) i++;
            max=prices[i];
            res+=max-min;
        }
        return res;
    }
}