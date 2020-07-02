// Best Time - I
// Time Complexity : O(n)   
// Space Complexity : O(1)
// Did this code succesfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// 1. Store lowest share price and maxProfit earned so far in
// 2. Iterate through the array and update both of them and finally return maxProfit

int bestTime(vector<int> prices){
    if(prices.size() == 0)
        return 0;
    int lowest=prices[0], maxProfit = 0;
    for(int i=1;i<prices.size();i++){
        if(prices[i]-lowest > maxProfit)
            maxProfit = prices[i]-lowest;
        else if(prices[i]<lowest)
            lowest = prices[i];
    }
    return maxProfit;
}

// Best Time - II
// Time Complexity : O(n)   
// Space Complexity : O(1)
// Did this code succesfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// 1. Store lowest share price and maxProfit earned so far in
// 2. Iterate through the array and update both of them and finally return maxProfit

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int profit;
        for(int i=1;i<prices.size();i++){
        	if(prices[i] > prices[i-1])
        		profit += prices[i]-prices[i-1];
        }
        return profit;
    }
};