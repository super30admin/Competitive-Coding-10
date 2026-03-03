class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int valley = INT_MAX;
        int peak = INT_MIN;
        int i=0;
        int profit = 0;
]
        while (i< prices.size()-1) {
            while (i<prices.size()-1 && prices[i] >= prices[i+1]) 
                i++;
            valley = prices[i];
            while (i<prices.size()-1 && prices[i] <= prices[i+1]) // 
                i++;
            peak = prices[i];
            profit += (peak-valley);
        }
        return profit;
    }
};
