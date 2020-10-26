// Time Complexity : O(n) for traversing once trhough complete input
// Space Complexity : O(1) we are not creating any space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning

class Solution {
public:
        int maxProfit(vector<int>& prices) {
  int profit = 0;
        int min_value = INT_MAX;
    
        for(int i=0; i< prices.size(); i++){
            min_value = min(prices[i], min_value);
            profit = max(profit, prices[i] - min_value);
        }
        return profit;
    }
};

