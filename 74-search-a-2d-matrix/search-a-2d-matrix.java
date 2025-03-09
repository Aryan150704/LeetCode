class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[0].length-1;
            int mid=(start+end)/2;
            for(int j=0;j<matrix[0].length;j++){
                mid=(start+end)/2;
                if(matrix[i][mid]==target)
                return true;
                else if(matrix[i][mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return false;
    }
}