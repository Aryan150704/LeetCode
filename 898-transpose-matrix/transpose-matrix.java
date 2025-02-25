class Solution {
    public int[][] transpose(int[][] matrix) {
        int trans[][]=new int[matrix[0].length][matrix.length];
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                trans[i][j]=matrix[j][i];
            }
        }
        return trans;
    }
}