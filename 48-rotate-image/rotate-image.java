class Solution {
    public void rotate(int[][] matrix) {
        int[][] arr=new int[matrix.length][matrix[0].length];
        int l=matrix[0].length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[j][l]=matrix[i][j];
            }
            l--;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                matrix[i][j]=arr[i][j];
            }
        }
    }
}