
class Solution {
    int[][] dirs;
    int m, n;
    int result;
    public int getMaximumGold(int[][] grid) {
        if(grid.length == 0 || grid == null)
            return 0;
        
        result = 0;
        
        dirs = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        m = grid.length;
        n = grid[0].length;
        
        //iterate through matrix to check all starting points
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                helper(grid, i, j, 0);
            }
        }
        
        return result;
    }
    
    private void helper(int[][] grid, int row, int col, int gold){
        //base case
        if(row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == 0){
            result = Math.max(result, gold);
            return;
        }
        
        //logic
        int curr = grid[row][col];

        //mark origin as visited
        grid[row][col] = 0;

        
        for(int[] dir: dirs){
            int nr = row + dir[0];
            int nc = col + dir[1];
            helper(grid, nr, nc, gold + curr);
        }
        //set the origin back to its original value
        grid[row][col] = curr;
    }
}