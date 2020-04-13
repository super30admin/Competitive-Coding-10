# Time complexity:O(n)
# Space complexity: 0(n)
# Did code run successfully on leetcode: yes
# Any problem you faced: No






class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0;
        int j = 0;
        int index = 0;
        List<int[]> res = new ArrayList();
        while (i < A.length && j < B.length) {
            if (A[i][1] < B[j][0]) {
                i += 1;
            }
            else if (B[j][1] < A[i][0]) {
                j += 1;
            }
            else {
                int[] ans = new int[2];
                ans[0] = Math.max(A[i][0], B[j][0]);
                ans[1] = Math.min(A[i][1], B[j][1]);
                res.add(ans);
                index += 1;
                if (B[j][1] == ans[1] && A[i][1] == ans[1]) {
                    i += 1;
                    j += 1;
                } else if (B[j][1] == ans[1]) {
                    j += 1;
                } else if (A[i][1] == ans[1]) {
                    i += 1;
                }
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}