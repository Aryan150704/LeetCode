class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length/2;i++){
            for(int j=0;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[matrix.length-i-1][j];
               matrix[matrix.length-i-1][j]=temp;
            }
        }
        //if(matrix.length>1000)
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                if(i==j)break;
            }
            
        }
    }
}