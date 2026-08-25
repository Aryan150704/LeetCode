class NumMatrix {
    int[][] arr;
    public NumMatrix(int[][] matrix) {
        arr=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==0){
                    if(j==0){
                        arr[i][j]=matrix[i][j];
                        continue;
                    }
                    arr[i][j]=matrix[i][j]+arr[i][j-1];
                }
                else{
                    if(j==0){
                        arr[i][j]=matrix[i][j]+arr[i-1][j];
                        continue;
                    }
                    arr[i][j]=matrix[i][j]+arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1];
                }
            }
        }
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = arr[row2][col2];
        if (row1 > 0) total -= arr[row1-1][col2];
        if (col1 > 0) total -= arr[row2][col1-1];
        if (row1 > 0 && col1 > 0) total += arr[row1-1][col1-1];
        return total;
    }
    
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */