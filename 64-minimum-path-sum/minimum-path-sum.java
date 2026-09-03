class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return min(grid,m-1,n-1,dp);
    }
    public int min(int[][] grid,int m,int n,int[][] dp){
        if(m==0 && n==0)return grid[m][n];
        if(m<0 || n<0)return Integer.MAX_VALUE;
        if(dp[m][n]!=-1)return dp[m][n];
        dp[m][n]=Math.min(min(grid,m-1,n,dp),min(grid,m,n-1,dp))+grid[m][n];
        return dp[m][n];
    }
}