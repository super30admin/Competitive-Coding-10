
// Time Complexity : O(Max(N))
// Space Complexity : O(Max(N))
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp = new int[days[days.length-1]+1];
        HashSet<Integer> daySet = new HashSet<>();
        for(int day : days) daySet.add(day);
        dp[0] = 0;
        for(int i = 1 ; i < dp.length; i++){
            if(daySet.contains(i)){
               int cost1 = i-1 >= 0 ? dp[i-1] + costs[0] : costs[0];
               int cost7 = i-7 >= 0 ? dp[i-7] + costs[1] : costs[1];
               int cost30 = i-30 >= 0 ? dp[i-30] + costs[2] : costs[2];
               dp[i] = Math.min(Math.min(cost1,cost7),cost30); 
            }else{
                dp[i] = dp[i-1];
            }
        }
        return dp[dp.length-1];
    }
}
