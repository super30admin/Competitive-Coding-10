// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int mincostTickets(int[] days, int[] costs) {

        Set<Integer> set = new HashSet<>();
        int maxDay = Integer.MIN_VALUE;
        
        for(int day: days) {
            set.add(day);
            maxDay = Math.max(day, maxDay);
        }
        
        int[] dp = new int[maxDay + 1];
        dp[0] = 0;
        for(int i = 1; i <= maxDay; i++) {
            
            if(!set.contains(i)) {
                dp[i] = dp[i-1];
            } else {
                dp[i] = Math.min(costs[0] + dp[Math.max(0, i-1)], Math.min(costs[1] + dp[Math.max(0, i-7)], costs[2] + dp[Math.max(0, i-30)]));
            }
        }
        
        return dp[maxDay];
    }
}