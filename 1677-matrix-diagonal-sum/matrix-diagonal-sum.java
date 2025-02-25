class Solution {
    public int diagonalSum(int[][] mat) {
       int i=0;int j=0;
       int s=0;
       while(i<mat.length&&j<mat.length){
        s=s+mat[i][j];
        i++;
        j++;
       } 
       int k=0;int l=mat[0].length-1;
       while(k<mat.length&&l>=0){
        s=s+mat[k][l];
        k++;
        l--;
       }
       if(mat.length%2==1){
        int p=mat.length/2;
        s=s-mat[p][p];
       }
       return s;
    }
}