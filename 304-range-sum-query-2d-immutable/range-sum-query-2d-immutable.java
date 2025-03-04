class NumMatrix {
    private int[][] SumMatrix;
    public NumMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        SumMatrix = new int[rows + 1][cols + 1];
        for(int i = 0;i < rows;i++) {
            int prefix = 0;
            for(int j = 0;j < cols;j++) {
                prefix += matrix[i][j]; 
                int above = SumMatrix[i][j+1];
                SumMatrix[i+1][j+1] = above + prefix;
            }
            
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;

        int br = SumMatrix[row2][col2];
        int ab = SumMatrix[row1 - 1][col2];
        int lt = SumMatrix[row2][col1 - 1];
        int tlt = SumMatrix[row1 - 1][col1-1];
        return br - ab - lt + tlt;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */