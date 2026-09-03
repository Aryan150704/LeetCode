class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=-2;
                }
                else
                dp[i][j]=-1;
            }
        }
        return path(m-1,n-1,dp);
        //return dp[m-1][n-1];
    }
    public int path(int m,int n , int[][] dp){
        
        if(m<0 || n<0 || dp[m][n]==-2)return 0;
        if(m==0 && n==0)return 1;
        if(dp[m][n]!=-1)return dp[m][n];
        dp[m][n]=path(m-1,n,dp)+path(m,n-1,dp);
        return dp[m][n];
    }
}