class Solution {

    //Time Complexity: 0(n) where n is the length of the array
    //Space complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you face any problem while coding: No

    //In brief explain your appraoch

    public int maxProfit(int[] prices) {
        int i = 0;  //I am taking a variable i to iterate over the array
        int valley = 0; //finding the valley
        int peak = 0;   //finding the peak
        int total = 0;  //to return the total profit
        while(i < prices.length - 1){
            while(i < prices.length-1 && prices[i] >= prices[i+1]){ //condition to find valley
                i++;//we move forward until we find the valley
            }
            valley = prices[i]; //once the upper while loop exits, means we found our valley
            while(i < prices.length-1 && prices[i] <= prices[i+1]){ //finding the peak
                i++;    //movinf forward until we find a peak
            }
            peak = prices[i];   //once the condition is false, we have found the peak
            total = total + peak-valley;    //adding the previous total and subtracting the peak from valley to give the total profit
        }
        return total;   //returning the final profit
    }
}