class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i;j<matrix[0].length;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-j-1]=temp;
            }
        }
    }
    public void swap(int[][] arr,int i,int j){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
}