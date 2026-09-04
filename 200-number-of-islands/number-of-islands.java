class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!='0'){
                    count++;
                    remove(grid,i,j);
                }
            }
        }
        return count;
    }
    public void remove(char[][] grid,int i,int j){
        if(i<0 ||j<0 ||i>grid.length-1 || j>grid[0].length-1)return ;
        if(grid[i][j]=='0')return ;
        grid[i][j]='0';
        remove(grid,i+1,j);
        remove(grid,i-1,j);
        remove(grid,i,j+1);
        remove(grid,i,j-1);
        return ;
    }
}