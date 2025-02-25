class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int originalRow = mat.length;
        int originalCol = mat[0].length;

        if (originalRow * originalCol != r * c)
            return mat;

        int row = 0;
        int col = 0;

        int[][] res = new int[r][c];

        for (int i = 0; i < originalRow; i++) {
            for (int j = 0; j < originalCol; j++) {
                res[row][col] = mat[i][j];
                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return res;

    }
}