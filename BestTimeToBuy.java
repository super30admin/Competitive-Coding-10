//Time complexity is O(N)
//space complexity is O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int good=prices[0];
        int result = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<good){
                good = prices[i];
            }
            else if(prices[i]>good){
                result=result+prices[i]-good;
                good = prices[i];
            }
        }
        return result;
    }
}