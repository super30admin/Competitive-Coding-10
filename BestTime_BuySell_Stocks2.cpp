// Time Complexity : O(n) for traversing once trhough complete input.
// Space Complexity : O(1) we are not creating any space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no issues as of now.. Learning

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int difference = 0;
        for(int i=1; i<prices.size();i++){
            if(prices[i] > prices[i-1]){
                difference += prices[i] - prices[i-1];
            }
        }
        return difference;
    }
};
