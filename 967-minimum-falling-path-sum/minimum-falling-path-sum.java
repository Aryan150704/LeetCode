class Solution {
    public int minFallingPathSum(int[][] matrix) {
        Integer[][] dp=new Integer[matrix.length][matrix[0].length];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            min=Math.min(min,min(matrix,dp,0,i));
        }
        return min;
    }
    public int min(int[][] matrix,Integer[][] dp,int i,int j){
        if(i<0 || j<0 || i>matrix.length-1||j>matrix[0].length-1)return  100000000;
        if(i==matrix.length-1 ){
            return matrix[i][j];
        }
        if(dp[i][j]!=null) return dp[i][j];
        int left=min(matrix,dp,i+1,j-1);
        int mid=min(matrix,dp,i+1,j);
        int right=min(matrix,dp,i+1,j+1);
        dp[i][j]=Math.min(mid,Math.min(left,right))+matrix[i][j];
        return dp[i][j];
    }
}   