/**
 * @Time Complexity:
 * O(n)  where n is the number of elements
 * 
 */

/**
 * @Space Complexity:
 * O(1)
 * 
 */

/**
 * @Approach:
 * Peak Valley Approach:
 * We have to find the valley that is the lowest
 * point in the given array first and then
 * then next peak point which is greater than the
 * valley point. The difference between then is 
 * our profit. We have to repeat this process.
 * 
 * 
 * For single pass:
 * We can observe that we can also get the correct
 * results if we are comparing the current and
 * the previous value. If the current value is
 * greater than the previous value we can calaculate the
 * profit.
 * 
 */

//The code ran perfectly on leetcode

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int low = prices[0], high = prices[0];
        int s = prices.size()-1;
        
        int i = 0;
        int profit = 0;
        while(i < s){
            while(i < s && prices[i] >= prices[i+1]){
                i++;
            }
            low = prices[i];
            while(i <s && prices[i] < prices[i+1]){
                i++;
            }
            high = prices[i];
            profit += high - low;
        }
        
        return profit;
    }
};


class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int profit = 0;
        
        for(int i = 1; i< prices.size(); i++){
            if(prices[i]> prices[i-1]){
                profit+= prices[i] - prices[i-1];
            }
        }
        
        return profit;
        
    }
};