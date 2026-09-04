class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prev=image[sr][sc];
        //image[sr][sc]=color;
        remove(image,sr,sc,color,prev);
        return image;
    }
    public void remove(int[][] grid,int i,int j,int color,int prev){
        if(i<0 ||j<0 ||i>grid.length-1 || j>grid[0].length-1)return ;
        if(grid[i][j]==color)return ;
        if(grid[i][j]==prev){
            grid[i][j]=color;
            remove(grid,i+1,j,color,prev);
            remove(grid,i-1,j,color,prev);
            remove(grid,i,j+1,color,prev);
            remove(grid,i,j-1,color,prev);
        }
        return ;
    }
}