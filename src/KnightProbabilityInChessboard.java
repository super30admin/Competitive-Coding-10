//Problem url: https://leetcode.com/problems/knight-probability-in-chessboard/
// Time Complexity : O(N^2 * K)
// Space Complexity : O(N^2)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class KnightProbabilityInChessboard {
	public double knightProbability(int N, int K, int r, int c) {
        int[][] dirs = {{1,2}, {1,-2}, {2,1}, {2,-1}, {-1,2}, {-1,-2}, {-2,1}, {-2,-1}};
        double[][] chess1 = new double[N][N];
        double[][] chess2 = new double[N][N];
        chess1[r][c] = 1;
	    double value = 8.0;
        double result = 0.0;
        
	    for (int i = 0; i < K; i++) {
		    for (int row = 0; row < N; row++) {
			    for (int col = 0; col < N; col++) {
				    if (chess1[row][col] > 0.0) {
					    for (int [] dir : dirs) {
                            int currRow = row + dir[0];
                            int currCol = col + dir[1];
						    if (currRow >= 0 && currRow < N && currCol >= 0 && currCol < N) {
							    chess2[currRow][currCol] += chess1[row][col] / value;
						    }
					    }
				    }
			    }
		    }
		    chess1 = chess2;
		    chess2 = new double[N][N];
	    }
	    for (int i = 0; i < N; i++) {
		    for (int j = 0; j < N; j++) {
			    result += chess1[i][j];
		    }
	    }
        return result;
    }
}
