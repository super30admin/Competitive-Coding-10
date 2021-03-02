
/*
observe here: that we can first find low value, then go for higher one i.e.e first find valley then find peak
time complexity: O(n)
space complexity: O(1)

*/
class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        
        int i = 0;
        while(i < prices.length - 1){
            //find the peak
            while(i < prices.length - 1 && prices[i] >= prices[i+1]){
                i++;
            }
            int peak = prices[i];
            
            //find the valley
            while(i < prices.lengthBest-1 && prices[i] <= prices[i+1]){
                i++;
            }
            int valley = prices[i];
            
            maxProfit += valley - peak;
            
        }
       return maxProfit;
    }
}

//7,1,5,3,6,4

//1,5 = 4
//5,6 = 1 = 5
//3,6 = 3 = 7

//1,6 = 5