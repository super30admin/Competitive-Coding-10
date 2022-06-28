//Time - O(n)
//Space - O(n)

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        HashSet<Integer> set = new HashSet<>();
        int[] dp = new int[days[days.length-1]+1];
        dp[0]=0;
        for(int day: days){
            set.add(day);
        }
        for(int i =1; i< dp.length; i++){
            if(!set.contains(i)){
                dp[i] = dp[i-1];
                continue;
            }else{
                dp[i] = Math.min(dp[Math.max(0,i-1)] + costs[0] , Math.min(dp[Math.max(0,i-7)] +costs[1], dp[Math.max(0,i-30)] + costs[2]));
            }
        }
        return dp[dp.length-1];
    }
}