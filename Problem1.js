// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

var maxProfit = function(prices) {
    //TC : O(N)
    //SC : O(1)
    let maxProfit = 0
    let left = 0
    let right = left+1
    while(right < prices.length){
        if(prices[right] > prices[left]){
            maxProfit += prices[right] - prices[left]
        }
        left++
        right++
    }
    return maxProfit 
    
};