// Time Complexity : O(nlogn)
// Space Complexity : O(n)
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//1. Create a max heap of pair and find the profit
//2. If the profit is greater than the current profir take it
//3. If less ignore it. Pop elements if the index is lesser than the curren index as you cannot sell before purchasing
 class comp{
    public:
    bool operator()(const pair<int,int> &a, const pair<int,int> &b){
        return a.first < b.first;
    };  
};

class Solution {
public:
    int maxProfit(vector<int>& prices) {
        //edge
        if(prices.size()==NULL)
            return 0;
        
        //logic : (value, index) 
        priority_queue<pair<int, int>, vector<pair<int,int>>, comp> max_pq;
        for(int i=0; i<prices.size(); i++){
            max_pq.push({prices[i], i});
        }
        int profit=INT_MIN;
        for(int i=0; i<prices.size(); i++){
            int num = prices[i];
            pair<int,int> temp = max_pq.top();
            cout<<temp.first<<endl;
            while(temp.second < i){
                max_pq.pop();
                temp = max_pq.top();
            }
            int temp_profit = temp.first - num;
            if(temp_profit > profit)
                profit = temp_profit;
        }
        
        if(profit == INT_MIN)
            return 0;
        else
            return profit;
    }
};
