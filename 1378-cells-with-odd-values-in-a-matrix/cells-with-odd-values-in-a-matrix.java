class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][]=new int[m][n];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < n; j++) {
                arr[row][j]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][col]++;
            }
        }
        int count =0;
        for(int i=0;i<arr.length;i++){
             for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]%2!=0)
                count++;
        }
        }
        return count;
    }
}