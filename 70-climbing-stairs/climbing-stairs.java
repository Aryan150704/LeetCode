class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        return c(n,dp);
    }
    public int c(int n,int[] dp){
        if(n==1||n==2)return n;
        if(dp[n]!=0)return dp[n];
        dp[n]=c(n-1,dp)+c(n-2,dp);
        return dp[n];
    }
}