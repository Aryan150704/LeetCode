class Solution {
    public static int fxn(String t1,int n ,String t2, int m,int[][] dp ){
        if(n == 0 || m == 0)return 0;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(t1.charAt(n-1) == t2.charAt(m-1))
            return dp[n][m]=1+fxn(t1,n-1,t2,m-1,dp);
        else return dp[n][m]=Math.max(fxn(t1,n-1,t2,m,dp),fxn(t1,n,t2,m-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int[n+1][m+1];
        for(int[] row : dp)
        Arrays.fill(row,-1);
        return fxn(text1,n,text2,m,dp);
    }
}