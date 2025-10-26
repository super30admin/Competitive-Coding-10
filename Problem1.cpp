// Problem: Best time to buy and sell stock
//  Time Complexity : O(n)
//  Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach in three
// sentences only
// 1. We take a greedy approach here, by just checking the previous element
// 2. If previous element is smaller than current element, we make a profit
// 3. Otherwise we skip it, giving us the maximum profit

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int maxProfit(vector<int> &prices) {
    int maxi = 0;
    for (int i = 1; i < prices.size(); i++) {
      if (prices[i - 1] < prices[i]) {
        maxi += prices[i] - prices[i - 1];
      }
    }
    return maxi;
  }
};
