class Solution {
    int[][] grid;
    int[][] memo;
    public int minFallingPathSum(int[][] matrix) {
        grid = matrix;
        int m = matrix.length, n = matrix[0].length;
        memo = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            Arrays.fill(memo[i], Integer.MAX_VALUE);
        }
        
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, dp(0, i));
        }
        
        return ans;
    }
    
    int dp(int row, int column) {
        if (row == grid.length - 1) {
            return grid[row][column];
        }
        
        if (memo[row][column] != Integer.MAX_VALUE)
            return memo[row][column];
        
        int ans = Integer.MAX_VALUE;
        ans = Math.min(ans, dp(row + 1, column));
        
        if (column > 0)
            ans = Math.min(ans, dp(row + 1, column - 1));
        
        if (column < grid[0].length - 1)
            ans = Math.min(ans, dp(row + 1, column + 1));
        
        memo[row][column] = grid[row][column] + ans;        
        return memo[row][column];
    }
}