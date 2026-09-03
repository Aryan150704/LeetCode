class Solution {
    public int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[n][n], next = new int[n][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        dp[0][n - 1] = grid[0][0] + grid[0][n - 1];

        for (int r = 1; r < m; r++) {
            for (int[] row : next) Arrays.fill(row, -1);
            for (int a = 0; a < n; a++)
                for (int b = a; b < n; b++) {
                    if (dp[a][b] < 0) continue;
                    for (int na = a - 1; na <= a + 1; na++)
                        for (int nb = b - 1; nb <= b + 1; nb++) {
                            if (na < 0 || nb >= n || na > nb) continue;
                            int gain = grid[r][na] + (na == nb ? 0 : grid[r][nb]);
                            if (dp[a][b] + gain > next[na][nb]) next[na][nb] = dp[a][b] + gain;
                        }
                }
            int[][] t = dp; dp = next; next = t;
        }

        int ans = 0;
        for (int a = 0; a < n; a++)
            for (int b = a; b < n; b++) ans = Math.max(ans, dp[a][b]);
        return ans;
    }
}