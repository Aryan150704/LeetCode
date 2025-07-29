class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i+j==mat.length-1||i==j) sum+=mat[i][j];
            }
        }
        return sum;
    }
}

//00 01 02 03 04
//10 11 12 13 14
//20 21 22 23 24
//30 31 32 33 34
//40 41 42 43 44