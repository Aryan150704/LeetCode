class Solution {
    public int minimumTotal(List<List<Integer>> trangle) {
        Integer[][] dp=new Integer[trangle.size()][trangle.size()];
        return minm(trangle,0,0,dp);
    }
    public int minm(List<List<Integer>> trangle,int i,int j,Integer[][] dp){
        if(i==trangle.size()-1)return trangle.get(i).get(j);
        if(i>=trangle.size())return Integer.MAX_VALUE;
        if(dp[i][j]!=null)return dp[i][j];
        int left=minm(trangle,i+1,j+1,dp);
        int below=minm(trangle,i+1,j,dp);
        dp[i][j]=Math.min(left,below)+trangle.get(i).get(j);
        return dp[i][j];
    }
}