//Problem 132: Best Time to Buy and Sell Stock II
//TC:O(n)
//SC:O(1)

//1st Approach
class Solution132 {
    public int maxProfit(int[] prices) {
     
        int minPrice = prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }
            
            if(prices[i]>minPrice){
                res += prices[i]-minPrice;
                //reset min price;
                minPrice = prices[i];
            }
            
        }
     return res;   
    }
}

//2nd Approach
/*
class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int sellPointer = n-1;
        int sum =0;
        
        for(int purPointer=n-2;purPointer>=0;purPointer--){
            
            if(prices[sellPointer]>prices[purPointer]){
                sum += prices[sellPointer]-prices[purPointer];
                
            }
            sellPointer--;
        }
        
        return sum;
    }
}



*/