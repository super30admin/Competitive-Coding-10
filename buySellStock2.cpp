// Time Complexity :O(n) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int i = 0;
        int buy = -1;
        int profit = 0;
        while(i < prices.size()-1){
            if(prices[i] < prices[i+1]){
                if(buy == -1) buy = i;
            }
            else if(buy != -1){
                profit+=prices[i] - prices[buy];
                buy = -1;
            }
            if(i == prices.size()-2 && buy != -1) profit+=prices[i+1] - prices[buy];
            i++;
        }
        return profit;
    }
};