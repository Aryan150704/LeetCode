class Solution {
    public int maxelement(int[][] grid,int startR,int startC){
        int maxelement=Integer.MIN_VALUE;
        for(int i=startR ;i<startR+3;i++){
            for(int j=startC ;j<startC+3;j++){
                maxelement=Math.max(grid[i][j],maxelement);
            }
        }
        return maxelement;
    }
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int arr[][]=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                arr[i][j]=maxelement(grid,i,j);
            }
        }
        return arr;
    }
}