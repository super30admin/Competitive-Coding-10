/**
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {

        // base case
        if(prices == null || prices.length <=1)
            return 0;

        int result =0;
        for(int i=0; i < prices.length; i++){

            int low = 0;

            while( i < prices.length-1 && prices[i] > prices[i+1]){
                i++;
            }

            low = prices[i];

            int high = 0;

            while( i < prices.length-1 && prices[i] < prices[i+1]){
                i++;
            }

            high = prices[i];

            result += (high - low);

        }

        return result;
    }
}