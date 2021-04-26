//TC: O(N)
//SC: O(1)



class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int maxprofit = 0;
        int result = 0;
        int minprice = INT_MAX;
        
        for(int i=0; i<prices.size(); i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            }
            
            if(prices[i] - minprice > maxprofit){
                result += prices[i] - minprice;
                minprice = prices[i];
                maxprofit = 0;
            }
        }
        
        return result;
        
    }
};