class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int k=0;
        int sum=0;
        int total=0;
        int count=1;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                total+=count++;
                if(set.contains(grid[i][j])){
                    k=grid[i][j];
                }
                else{
                    sum+=grid[i][j];
                    set.add(grid[i][j]);
                }
            }
        }
        return new int[] {k,total-sum};
    }
}