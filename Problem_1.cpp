// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: Best Time to Buy and Sell Stock II
// Approach: We can make a profit by buying and selling.
// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
    public:
        int maxProfit(vector<int>& prices) {
            
            //Base Case
            if(prices.size() == 0){
                return 0;
            }
    
            int profit = 0;
    
            for(int i = 1; i<prices.size();i++){
    
                if(prices[i] > prices[i-1]){
                    profit += prices[i] - prices[i-1];
                }
    
            }
    
            return profit;
        }
    };