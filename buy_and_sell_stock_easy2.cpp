// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :

//Understand that the first pointer stops 1 position before the kth element
//Understanding peaak valley concept took some time

// Your code here along with comments explaining your approach
//1. Find valley peak pair, important to match valley with immediate peak.
//2. add value to the profit
//3. return to the result
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        //edge
        if(prices.size()==NULL){
            return 0;
        }
        //logic :(value, index)
        int profit = 0;
        for(int i=0; i<prices.size()-1; i++){
            int k;
            if(prices[i]<prices[i+1]){
                for(k=i+1; k<prices.size()-1; k++){
                    if(prices[k]<prices[k+1]) continue;
                    else break;
                }
                profit = profit + prices[k] - prices[i];
                i=k;
            }
        }
        
        return profit;
    }
};
