//Time complexity :- O(N).
//space complexity:- 0(N);
//Did it run on leetcode:- Yes.
//approach is given in comments.



class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        HashSet<Integer> cache=new HashSet<>();
        int max=days[days.length-1];
        int[] dp=new int[max+1];//constructing an dp array of length max+1;
        for(int day:days){
            cache.add(day);//adding in cache for cases if elements are not there in present array .
        }
        for(int i=1;i<dp.length;i++){
            if(!cache.contains(i)){
                dp[i]=dp[i-1];
            }
            else{
            dp[i]=Math.min(dp[i-1]+costs[0],Math.min(dp[Math.max(i-7,0)]+costs[1],dp[Math.max(i-30,0)]+costs[2]));
            }//This the optimal dp formula in which we check for all choices.
        }
        return dp[dp.length-1];
    }
}