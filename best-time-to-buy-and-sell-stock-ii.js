  // Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
    // base case
    if (!prices || !prices.length || prices.length == 1) return 0;
    
    let totalProfit = 0;
    let prev = 0;
    let left = 0;
    let right = 1;
    while (prices[right] != null) {
        if (left == right) {
            right++;
            continue;
        }
        let currProfit = prices[right] - prices[left];
        if (currProfit > 0 && currProfit - prev > 0) {
            totalProfit += currProfit - prev;
            prev = currProfit;
            right++;
        } else {
            left = right++;
            prev = 0;
        }
    }
    
    return totalProfit;
};
