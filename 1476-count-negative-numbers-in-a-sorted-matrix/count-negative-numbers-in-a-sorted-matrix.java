class Solution {
    public static int countNegatives(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        int i=m-1;
        int j=0;
        while( j<n && i>=0){
            if (grid[i][j]<0){
                res += n - j;
                i -= 1;
            }
            else{
                j+=1;
            }
        }
        return res;
    }    
}