TC - O(N)
SC - O(1)

/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
   var max=0;
   for(let i=0;i<prices.length-1;i++)
    max+= Math.max(prices[i+1]-prices[i],0);
   return max;
};