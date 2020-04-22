//o(n) time and O(1) space  (n is ptra+ptrb)
//passed all leetcode cases
//used 2 pointer approach

class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> res = new ArrayList<>();
        int ptra=0,ptrb=0;
        while(ptra<A.length && ptrb<B.length){
            if(A[ptra][0]>B[ptrb][1]) ptrb++;
            else if(B[ptrb][0] >A[ptra][1]) ptra++;
            else{
                int[] integ = new int[2];
                integ[0] = Math.max(A[ptra][0], B[ptrb][0]);
                integ[1] = Math.min(A[ptra][1], B[ptrb][1]);
                res.add(integ);
                if(B[ptrb][1]< A[ptra][1]) ptrb++;
                else ptra++;
            }

        }
        return  res.toArray(new int[res.size()][2]);

    }
}