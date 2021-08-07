// Time Complexity : O(logm) + O(logn) - For mxn array
// Space Complexity :  O(m*n) - In Place
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this 

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int ptr = 0;
        
        int len = prices.size();
        
        int profit = 0;
        int stock_price = 0;
        
        int flag = 0;
        // 0 Buy
        // 1 Sell
        
        while(ptr < len)
        {
            // Buy
            if(flag == 0)
            {
                if(ptr+1 < len)
                {
                    if(prices[ptr] < prices[ptr+1])
                    {
                        // Buying stock
                        stock_price = prices[ptr];
                        flag = 1;
                    }
                }
            }
            //Sell
            else
            {
                // Earlier elements
                if(ptr+1 < len)
                {
                    if(prices[ptr] > prices[ptr+1])
                    {
                        // Selling Stock
                        profit += (prices[ptr] - stock_price);
                        stock_price = 0;
                        flag = 0;
                    }
                }
                // Last element
                else
                {
                    profit += (prices[ptr] - stock_price);
                    flag = 0;
                }
            }
            
            ptr++;
        }      
        return profit;
    }
};