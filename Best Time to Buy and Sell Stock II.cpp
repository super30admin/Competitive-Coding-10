//Time Complexity- O(n)
//Space Complexity- O(1)

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        
        int ans=0;
        int minVal=prices[0];
        for(int i=1;i<prices.size();i++){
            if(prices[i]<=minVal){
                minVal=prices[i];
            }
            else{
                ans+=prices[i]-minVal;
                minVal=prices[i];
            }
        }
        return ans;
    }
};