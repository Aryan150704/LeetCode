class Solution {
    public int countNegatives(int[][] grid) {
        int i=grid.length-1;
        int j=0,ans=0;
        while(j<grid[0].length && i>=0){
            if(grid[i][j]<0){
                ans+=grid[0].length-j;
                i--;
            }
            else j++;
        }
        return ans;
    }
}