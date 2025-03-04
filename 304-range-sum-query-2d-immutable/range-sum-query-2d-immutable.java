class NumMatrix {
    private int[][] prefixSumMatrix;

    // Constructor initializes the NumMatrix object
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        int rows = matrix.length, cols = matrix[0].length;
      
        // plus one to handle the border cases without extra condition checks
        prefixSumMatrix = new int[rows + 1][cols + 1];
      
        // Construct prefix sums matrix
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= cols; ++j) {
                // Computing the prefix sum for position (i, j)
                prefixSumMatrix[i][j] = prefixSumMatrix[i - 1][j] + prefixSumMatrix[i][j - 1]
                                         - prefixSumMatrix[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    // Return the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2)
    public int sumRegion(int row1, int col1, int row2, int col2) {
        // Apply the inclusion-exclusion principle to find the sum of the region
        return prefixSumMatrix[row2 + 1][col2 + 1] - prefixSumMatrix[row2 + 1][col1] 
               - prefixSumMatrix[row1][col2 + 1] + prefixSumMatrix[row1][col1];
    }
}

// This is an example usage provided for reference; actual usage may vary
/*
NumMatrix numMatrix = new NumMatrix(matrix);
int param1 = numMatrix.sumRegion(row1, col1, row2, col2);
*/
