// Time Complexity: O(n)
// Space Complexity: O(1)
// Did the code run successfully on Leetcode? Yes

// Approach: 
// 1. We either buy and sell if next day has higher price than today or we do nothing.
// 2. We keep track of the profit by adding the difference between the two days if the next day has higher price than today.

class Solution {
    public:
        int maxProfit(vector<int>& prices) {
            int profit = 0; 
            if(prices.size() < 2){return profit;}
            int first = 0, second = 1;
            for(second; second < prices.size(); second++){
                if(prices[first] < prices[second]){
                    profit += prices[second] - prices[first];
                }
    
                first++;
            }
            return profit;
        }
    };