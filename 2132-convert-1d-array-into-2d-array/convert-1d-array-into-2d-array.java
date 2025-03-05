class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(original.length!=m*n){
            return new int[][] {};
        }
        int nn=0;
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=original[nn];
                nn++;
            }
        }
        return arr;
    }
}