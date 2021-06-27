/*
Intuition: Profit = Selling Val - Buying Val
We want to maximize selling val and minimize buying val.
/////////////////////////////////////
For only 1 transaction, we can first find the buying val by searching for the minimum.
For multiple transactions, we can find find the recurring min and max locally
/////////////////////////////////////
Time Complexity: O(N)
Space Complexity: O(1)
/////////////////////////////////////
*/



//If only 1 transaction is allowed
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minVal = prices[0];
        int profit = 0;
        for ( int i = 0; i < prices.size(); i++){
    
            minVal = min( minVal, prices[i]);
            
            profit = max( profit, prices[i] - minVal);
            
        }
        return profit;
    }
};

//If multiple transactions are allowed

class Solution {
public:
    int maxProfit(vector<int>& prices) {

        int profit = 0;
        for (int i = 0; i < prices.size()-1; i++) {
            if (prices[i] < prices[i+1])
                profit += prices[i+1] - prices[i];

        }
        return profit;

    }
};