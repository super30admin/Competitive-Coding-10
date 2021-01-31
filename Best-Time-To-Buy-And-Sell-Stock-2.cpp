// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        if(prices.size()==1){
            return 0;
        }
        int prev = 0;
        int current = 1;
        int sum = 0;
        
        while(current<n){
            if(prices[current]-prices[prev]>0){
                sum = sum + prices[current]-prices[prev];
            }
            current++;
            prev++;
        }
        return sum;
    }
};
