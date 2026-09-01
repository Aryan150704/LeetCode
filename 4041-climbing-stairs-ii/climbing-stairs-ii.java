class Solution {
    public int climbStairs(int n, int[] costs) {
        long[] dp=new long[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            long size=Long.MAX_VALUE;
            for(int j=1;j<=3 && j<=i;j++){
                size=Math.min(size,dp[i-j]+j*j);
            }
            dp[i]=costs[i-1]+size;
        }
        return (int)dp[n];
    }
}