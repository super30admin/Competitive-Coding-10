/*Time Complexity: O(N)

Space Complexity: O(1)

Did this code successfully run on Leetcode : Yes

Approach: Finding the difference between the prev day stock and the curr day stock and finding max
profit.

Prob: 122. Best Time to Buy and Sell Stock II
*/
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int maxVal = INT_MIN;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(prices[i] > prices[i-1]){
                int val = prices[i] - prices[i-1];
                profit += max(maxVal,val);
            }
        }
        return profit;
    }
};